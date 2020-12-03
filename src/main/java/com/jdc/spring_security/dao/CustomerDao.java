package com.jdc.spring_security.dao;

import com.jdc.spring_security.ds.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<Customer,Integer> {
}
