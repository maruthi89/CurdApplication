package com.Sample.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sample.Demo.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
