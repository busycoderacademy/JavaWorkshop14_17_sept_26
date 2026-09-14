package com.session3.example10;

import java.util.List;

public interface GenericDao<T extends Entity<ID>, ID> {
    T save(T entity);
    T update(T entity);
    void delete(ID id);
    T findById(ID id);
    List<T> findByProperty(String property, Object value);
}
