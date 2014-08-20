package br.com.pep.persistence.interfaces;

import java.util.List;

import javax.persistence.criteria.Predicate;

public interface IDao<T> {

	T findById(Integer id);
	List<T> getByCriteria(Predicate...predicates);
	T getUniqueByCriteria(Predicate...predicates);
	T save(T entity);
	void delete (T entity);	
}
