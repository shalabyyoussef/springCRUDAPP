package com.hr.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hr.model.Employee;


@Repository
public interface EmployeeRepositry extends JpaRepository<Employee, Long>{
	
	
public List<Employee> getEmpByfirstName(String firstName );	


@Query("select emp from Employee emp where emp.firstName = :firstNameBind and emp.lastName =:lastNameBind ")
public List<Employee> serachEmp (@Param ("firstNameBind") String  firstName , @Param ("lastNameBind") String lastName);



public List<Employee> findBydepartment_id(Long deptId);
}
