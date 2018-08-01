package com.bm.rra.crm.service;

import com.bm.rra.crm.entity.ServiceWorker;
import com.bm.rra.crm.repository.ServiceWorkerRepository;
import com.bm.rra.crm.repository.base.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceWorkerServiceImpl extends UserServiceImpl<ServiceWorker, Long> implements ServiceWorkerService {
    private ServiceWorkerRepository serviceWorkerRepository;

    protected BaseRepository<ServiceWorker, Long> getRepository() {
        return serviceWorkerRepository;
    }

    @Autowired
    public ServiceWorkerServiceImpl(ServiceWorkerRepository serviceWorkerRepository) {
        this.serviceWorkerRepository = serviceWorkerRepository;
    }

    @Override
    public ServiceWorker save(ServiceWorker serviceWorker) {
        return serviceWorkerRepository.save(serviceWorker);
    }

    @Override
    public ServiceWorker getById(Long id) {
        return serviceWorkerRepository.getById(id);
    }

    @Override
    public void delete(ServiceWorker serviceWorker) {
        serviceWorkerRepository.delete(serviceWorker);
    }

    @Override
    public List<ServiceWorker> findAll() {
        return (List<ServiceWorker>) serviceWorkerRepository.findAll();
    }

    @Override
    public List<ServiceWorker> findAll(List<Long> ids) {
        return (List<ServiceWorker>) serviceWorkerRepository.findAllById(ids);
    }


    @Override
    public List<ServiceWorker> save(List<ServiceWorker> var1) {
        return (List<ServiceWorker>) serviceWorkerRepository.saveAll(var1);
    }

    @Override
    public Page<ServiceWorker> findAll(Pageable pageable) {
        return serviceWorkerRepository.findAll(pageable);
    }
}
