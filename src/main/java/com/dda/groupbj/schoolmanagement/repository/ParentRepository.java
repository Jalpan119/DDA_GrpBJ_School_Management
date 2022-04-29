package com.dda.groupbj.schoolmanagement.repository;

import com.dda.groupbj.schoolmanagement.dao.ParentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<ParentDao, Integer> {
}
