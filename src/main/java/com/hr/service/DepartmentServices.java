package com.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.model.Department;
import com.hr.model.Employee;
import com.hr.repositry.DepartmentRepositry;




@Service
public class DepartmentServices {
	
	@Autowired

	private DepartmentRepositry deprepositry;

	public List<Department> getAllDepts() {
    System.out.print("repooo");
		return deprepositry.findAll();
	}

	public Department getDeptBYID(long id) {

		return deprepositry.getById(id);
	}


	public void addDept(Department dept) {
		deprepositry.save(dept);
	}

	public void updateDept(Department dept)
	{
		deprepositry.save(dept);
	}
	
	
	
	public void deletedept (Long id) {
		
		deprepositry.deleteById(id);
	}
	
	
	

}
