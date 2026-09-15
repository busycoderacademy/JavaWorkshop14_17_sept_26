package com.busycoder.example10_generic_dao;

interface Entity<ID> {
    ID getId();
}

interface GenericDao<T extends Entity<ID>, ID> {
    T save(T entity);
    T update(T entity);
    void delete(ID id);
    T findById(ID id);
}

public class A_NeedOfGenericDaoLayer {
    public static void main(String[] args) {

    }
}
