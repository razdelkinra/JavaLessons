package com.bm.rra.crm.service;

import com.bm.rra.crm.entity.Manager;
import com.bm.rra.crm.repository.ManagerRepository;
import com.bm.rra.crm.repository.base.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl extends UserServiceImpl<Manager, Long> implements ManagerService {


    private ManagerRepository managerRepository;

    public ManagerServiceImpl() {

    }

    protected BaseRepository<Manager, Long> getRepository() {
        return managerRepository;
    }

    @Autowired
    public ManagerServiceImpl(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }


    @Override
    public Manager save(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public Manager getById(Long id) {
        return managerRepository.getById(id);
    }

    @Override
    public void delete(Manager salesManager) {
        managerRepository.delete(salesManager);
    }

    @Override
    public List<Manager> findAll() {
        return (List<Manager>) managerRepository.findAll();
    }

    @Override
    public List<Manager> findAll(List<Long> ids) {
        return (List<Manager>) managerRepository.findAllById(ids);
    }

    @Override
    public List<Manager> save(List<Manager> var1) {
        return (List<Manager>) managerRepository.saveAll((Iterable<Manager>) var1);
    }

    @Override
    public Page<Manager> findAll(Pageable pageable) {
        return managerRepository.findAll(pageable);
    }

}
