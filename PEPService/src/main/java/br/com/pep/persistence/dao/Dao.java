package br.com.pep.persistence.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.pep.persistence.interfaces.IDao;

public class Dao <Type> implements IDao<Type> {

	private Class<Type> entityClass;		
	
	@Inject private EntityManager em;
	
	public Dao() {
		this(null);
	}
		
	public Dao(Class<Type> entityClass) {
		this.entityClass = entityClass;
	}
	
	public Class<Type> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<Type> entityClass) {
		this.entityClass = entityClass;
	}
	
	@Override
	public Type save(Type entity) {
		em.persist(entity);
		return entity;
	}	
	
	@Override
	public Type update(Type entity) {
		em.merge(entity);
		return entity;
	}
	
	@Override
	public void delete(Type entity) {
		em.remove(entity);
	}
	
	@Override
	public Type findById(Integer id) {
		if(id == null)
			throw new PersistenceException("Id may not be null.");		
		return em.find(getEntityClass(), id);
	}

	@Override
	public List<Type> getByCriteria(Map<String, String> attributes) {
		
		List<Predicate> predicates = new ArrayList<Predicate>();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Type> criteria = builder.createQuery(getEntityClass());
		Root<Type> objRoot = criteria.from(getEntityClass());
		criteria.select(objRoot);
		
		for(String key : attributes.keySet()){
			if(objRoot.get(key) != null) {
				predicates.add(builder.and(builder.equal(objRoot.get(key),attributes.get(key))));
			}
		}		
		criteria.where(predicates.toArray(new Predicate[]{}));
		TypedQuery<Type> query = em.createQuery(criteria);

		return query.getResultList();
	}

	@Override
	public Type getUniqueByCriteria(Map<String, String> attributes) {
		
		List<Predicate> predicates = new ArrayList<Predicate>();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Type> criteria = builder.createQuery(getEntityClass());
		Root<Type> objRoot = criteria.from(getEntityClass());		
		criteria.select(objRoot);
		
		for(String key : attributes.keySet()){
			if(objRoot.get(key) != null) {
				predicates.add(builder.and(builder.equal(objRoot.get(key),attributes.get(key))));
			}
		}			
		criteria.where(predicates.toArray(new Predicate[]{}));
		TypedQuery<Type> query = em.createQuery(criteria);
		
		return query.getSingleResult();
	}	
}
