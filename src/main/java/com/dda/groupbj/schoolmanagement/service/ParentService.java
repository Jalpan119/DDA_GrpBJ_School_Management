package com.dda.groupbj.schoolmanagement.service;

import com.dda.groupbj.schoolmanagement.dao.ParentDao;
import com.dda.groupbj.schoolmanagement.repository.ParentRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentService {

    @Autowired
    ParentRepository repo;

    public Optional<ParentDao> getParentById(Integer parentId) {
        return repo.findById(parentId);
    }

    public ParentDao saveParent(ParentDao parent) {
        return repo.save(parent);
    }
}
