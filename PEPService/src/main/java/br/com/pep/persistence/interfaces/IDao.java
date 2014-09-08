package br.com.pep.persistence.interfaces;

import java.util.List;
import java.util.Map;

public interface IDao<T> {

	T findById(Integer id);
	List<T> getByCriteria(Map<String, String> attributes);
	T getUniqueByCriteria(Map<String, String> attributes);
	T save(T entity);
	T update(T entity);
	void delete (T entity);	
}
