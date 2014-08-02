package br.com.pep.persistence.interfaces;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

public interface IDao<T, Tid extends Serializable> {

	T findById(Tid id);
	List<T> getByCriteria(Criterion...criterions);
	T getUniqueByCriteria(Criterion...criterions);
	T save(T entity);
	T saveOrUpdate(T entity);
	void delete (T entity);	
}
