package com.bm.rra.crm.repository;

import com.bm.rra.crm.entity.crm.ServiceWorker;
import com.bm.rra.crm.repository.base.BaseRepository;

public interface ServiceWorkerRepository extends BaseRepository<ServiceWorker,Long> {
    ServiceWorker getById(Long id);
}
