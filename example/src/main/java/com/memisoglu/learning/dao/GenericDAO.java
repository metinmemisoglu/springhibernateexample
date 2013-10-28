package com.memisoglu.learning.dao;

import java.util.List;

import com.memisoglu.learning.model.DomainObject;

public interface GenericDAO<T extends DomainObject> {
	public T get(Long id);
	public List<T> getAll();
	public void save(T object);
	public void delete(T object);
}
