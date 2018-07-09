package com.bm.rra.crm.service;


import com.bm.rra.crm.repository.base.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author Razdelkin
 */
public abstract class UserServiceImpl<T, I extends Serializable>
		implements UserService<T, I>
{

	protected abstract BaseRepository<T, I> getRepository();

	@Transactional
	public T save(@NotNull @Valid T data)
	{
		return (T) this.getRepository().save(data);
	}

	public T getById(I id)
	{
		return (T) this.getRepository().findById(id);
	}

	@Transactional()
	public void delete(T entity)
	{
		this.getRepository().delete(entity);
	}

	public Iterable<T> findAll()
	{
		return this.getRepository().findAll();
	}

	public Iterable<T> findAll(List<I> ids)
	{
		return this.getRepository().findAllById(ids);
	}

	@Transactional
	public Iterable<T> save(@NotNull @Valid Iterable<T> data)
	{
		return this.getRepository().saveAll(data);
	}

	public Page<T> findAll(Pageable pageable) {
		return this.getRepository().findAll(pageable);
	}
}



