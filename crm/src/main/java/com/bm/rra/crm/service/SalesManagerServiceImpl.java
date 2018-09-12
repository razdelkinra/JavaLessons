package com.bm.rra.crm.service;

import com.bm.rra.crm.entity.crm.SalesManager;
import com.bm.rra.crm.repository.SalesManagerRepository;
import com.bm.rra.crm.repository.base.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesManagerServiceImpl extends UserServiceImpl<SalesManager, Long> implements SalesManagerService {


    private SalesManagerRepository salesManagerRepository;

    public SalesManagerServiceImpl() {

    }

    protected BaseRepository<SalesManager, Long> getRepository() {
        return salesManagerRepository;
    }

    @Autowired
    public SalesManagerServiceImpl(SalesManagerRepository salesManagerRepository)
    {
        this.salesManagerRepository = salesManagerRepository;
    }


    @Override
    public SalesManager save(SalesManager salesManager) {
        return salesManagerRepository.save(salesManager);
    }

    @Override
    public SalesManager getById(Long id) {
        return salesManagerRepository.getById(id);
    }

    @Override
    public void delete(SalesManager salesManager) {
        salesManagerRepository.delete(salesManager);
    }

    @Override
    public List<SalesManager> findAll() {
        return (List<SalesManager>) salesManagerRepository.findAll();
    }

    @Override
    public List<SalesManager> findAll(List<Long> ids) {
        return (List<SalesManager>) salesManagerRepository.findAllById(ids);
    }

    @Override
    public List<SalesManager> save(List<SalesManager> var1) {
        return (List<SalesManager>) salesManagerRepository.saveAll((Iterable<SalesManager>) var1);
    }

    @Override
    public Page<SalesManager> findAll(Pageable pageable) {
        return salesManagerRepository.findAll(pageable);
    }
}
