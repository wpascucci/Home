package br.com.pep.persistence.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Component;

import br.com.pep.persistence.interfaces.IDao;

@Component
public abstract class AbstractDAO <Type, ObjectIdType extends Serializable> implements IDao<Type, ObjectIdType> {

	private Class<Type> entityClass;
	private SessionFactory factory;
	
	public AbstractDAO(Class<Type> entityClass) {
		this.entityClass = entityClass;
	}
	
	public Class<Type> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<Type> entityClass) {
		this.entityClass = entityClass;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public SessionFactory getFactory() {
		return factory;
	}

	protected Session getSession() {
		return getFactory().getCurrentSession();
	}
	
	public Type save(Type entity) {
		this.getSession().save(entity);
		return entity;
	}	
	
	public Type saveOrUpdate(Type entity) {
		this.getSession().saveOrUpdate(entity);
		return entity;
	}
	
	public void delete(Type entity) {
		this.getSession().delete(entity);		
	}
	
	@SuppressWarnings("unchecked")
	public Type findById(ObjectIdType id) {
		if(id == null)
			throw new PersistenceException("Id may not be null.");
		return (Type)this.getSession().load(getEntityClass(), id);
	}

	@SuppressWarnings("unchecked")
	public List<Type> getByCriteria(Criterion...criterions) {
		
		Criteria criteria = this.getSession().createCriteria(getEntityClass());
		for(Criterion criterium : criterions){
			criteria.add(criterium);
		}
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public Type getUniqueByCriteria(Criterion...criterions) {
		
		Criteria criteria = this.getSession().createCriteria(getEntityClass());
		for(Criterion criterium : criterions){
			criteria.add(criterium);
		}
		return (Type)criteria.uniqueResult();
	}
	
}
