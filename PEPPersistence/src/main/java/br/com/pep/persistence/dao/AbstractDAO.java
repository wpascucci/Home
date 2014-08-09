package br.com.pep.persistence.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.pep.persistence.interfaces.IDao;

public abstract class AbstractDAO <Type, ObjectIdType extends Serializable> implements IDao<Type, ObjectIdType> {

	private Class<Type> entityClass;
		
	@Inject
	protected EntityManager em;
	
	public AbstractDAO(Class<Type> entityClass) {
		this.entityClass = entityClass;
	}
	
	public Class<Type> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<Type> entityClass) {
		this.entityClass = entityClass;
	}
	
	public Type save(Type entity) {
		em.persist(entity);
		return entity;
	}	
	
	public void delete(Type entity) {
		em.remove(entity);
	}
	
	public Type findById(ObjectIdType id) {
		if(id == null)
			throw new PersistenceException("Id may not be null.");		
		return em.find(getEntityClass(), id);
	}

	public List<Type> getByCriteria(Predicate...predicates) {
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Type> criteria = builder.createQuery(getEntityClass());
		Root<Type> objRoot = criteria.from(getEntityClass());
		criteria.select(objRoot);
		criteria.where(predicates);
		return em.createQuery(criteria).getResultList();
	}

	public Type getUniqueByCriteria(Predicate...predicates) {
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Type> criteria = builder.createQuery(getEntityClass());
		Root<Type> objRoot = criteria.from(getEntityClass());
		criteria.select(objRoot);	
		criteria.where(predicates);
		return em.createQuery(criteria).getSingleResult();
	}
	
}
