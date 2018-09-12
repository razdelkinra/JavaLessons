package com.bm.rra.crm.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Collection;

public interface BaseService<T, I extends Serializable> {

    @Transactional
    T save(T entity);

    T getById(I id);

    void delete(T entity);

    Page<T> findAll(Pageable pageable);

    Iterable<T> findAll();

}
