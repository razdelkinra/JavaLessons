package com.bm.rra.crm.repository;

import com.bm.rra.crm.entity.SalesManager;
import com.bm.rra.crm.repository.base.BaseRepository;


public interface SalesManagerRepository extends BaseRepository<SalesManager, Long> {

    SalesManager getById(Long id);

}
