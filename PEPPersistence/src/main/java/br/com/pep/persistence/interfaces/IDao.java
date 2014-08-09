package br.com.pep.persistence.interfaces;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.Predicate;

public interface IDao<T, Tid extends Serializable> {

	T findById(Tid id);
	List<T> getByCriteria(Predicate...predicates);
	T getUniqueByCriteria(Predicate...predicates);
	T save(T entity);
	void delete (T entity);	
}
