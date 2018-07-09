package com.bm.rra.crm.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface UserService<T, I extends Serializable> {

    T save(T entity);

    T getById(I id);

    void delete(T entity);

    Iterable<T> findAll();

    Iterable<T> findAll(List<I> ids);

    Iterable<T> save(List<T> var1);

    Page<T> findAll(Pageable pageable);
}
