package com.dda.groupbj.schoolmanagement.repository;

import com.dda.groupbj.schoolmanagement.dao.StudentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDao, Integer> {
}
