package com.jdc.spring_security.dao;

import com.jdc.spring_security.ds.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
