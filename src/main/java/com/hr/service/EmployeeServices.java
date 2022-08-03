package com.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.model.Employee;
import com.hr.repositry.EmployeeRepositry;

@Service
public class EmployeeServices {

	@Autowired

	private EmployeeRepositry emprepositry;

	public List<Employee> getAllEmployees() {

		return emprepositry.findAll();
	}

	public Employee getEmployeeBYID(long id) {

		return emprepositry.getById(id);
	}

	public List<Employee> getEmpByfirstName(String firstName)

	{

		return emprepositry.getEmpByfirstName(firstName);
	}

	public List<Employee> serachEmp(String firstName, String secondName) {

		return emprepositry.serachEmp(firstName, secondName);

	}

	public void addEmp(Employee emp) {
		emprepositry.save(emp);
	}

	public void updateEmp(Employee emp)
	{
		emprepositry.save(emp);
	}
	
	public void updateEmpbyid (Long id) {
	Employee updatedEmp	= emprepositry.getById(id);
	
	 updatedEmp.setFirstName("toooo");
	 updatedEmp.setLastName("tooo");
	 updatedEmp.setAddress("toooo");
	 updatedEmp.setSalary(105455);
		
		emprepositry.save(updatedEmp);
	}
	
	public void deleteEmp (Long id) {
		
		emprepositry.deleteById(id);
	}
	
	public List<Employee> getDeptEmps(long deptId){
		
		return emprepositry.findBydepartment_id( deptId);
		
	}
}
