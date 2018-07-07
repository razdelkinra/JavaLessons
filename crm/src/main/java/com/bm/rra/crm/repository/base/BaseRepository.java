package com.bm.rra.crm.repository.base;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable>
        extends PagingAndSortingRepository<T, ID> {

    void flush();

    T getOne(ID id);

    Iterable<T> findAll();
}
