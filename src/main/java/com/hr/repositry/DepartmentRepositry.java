package com.hr.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hr.model.Department;


@Repository
public interface DepartmentRepositry extends JpaRepository<Department, Long> {
	

}
