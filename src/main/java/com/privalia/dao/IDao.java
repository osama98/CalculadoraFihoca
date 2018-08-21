package com.privalia.dao;

public interface IDao<T> {
	T add(T model) throws UnsupportedOperationException;
}
