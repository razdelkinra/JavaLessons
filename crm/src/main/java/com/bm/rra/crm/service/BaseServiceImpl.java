package com.bm.rra.crm.service;

import com.bm.rra.crm.repository.base.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public abstract class BaseServiceImpl<T, I extends Serializable>
        implements BaseService<T, I> {

    protected abstract BaseRepository<T, I> getRepository();

    @Transactional
    public T save(@NotNull @Valid T data) {
        return this.getRepository().save(data);
    }

    public T getById(I id) {
        return this.getRepository().getOne(id);
    }

    @Transactional()
    public void delete(T entity) {
        this.getRepository().delete(entity);
    }

    public Page<T> findAll(Pageable pageable) {
        return this.getRepository().findAll(pageable);
    }

    public Iterable<T> findAll() {
        return this.getRepository().findAll();
    }
}



