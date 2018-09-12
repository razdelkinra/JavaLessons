package com.bm.rra.crm.repository;

import com.bm.rra.crm.entity.crm.Manager;
import com.bm.rra.crm.repository.base.BaseRepository;

public interface ManagerRepository extends BaseRepository<Manager,Long> {
    Manager getById(Long id);
}
