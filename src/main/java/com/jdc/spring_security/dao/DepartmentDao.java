package com.jdc.spring_security.dao;

import com.jdc.spring_security.ds.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends CrudRepository<Department,Integer> {
}
