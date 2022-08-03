package com.hr.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties.Embedded;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hr.model.Employee;
import com.hr.service.EmployeeServices;

@RestController
@RequestMapping ("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeServices empservices;


	@Value("${hr.file.path}")
	String filePath;
	
	@Value("spring.application.name")
	String appName;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
	
	 return empservices.getAllEmployees();
	}

	
    @GetMapping ("/getEmployeeBYID/{id}")
    public Employee getEmmployeeBYID( @PathVariable long id)
    {
    	return empservices.getEmployeeBYID(id);
    }
    
    
	@GetMapping("/getEmpByname")
	public List<Employee> getEmpByfirstName(@RequestParam String firstName)
	{
		return empservices.getEmpByfirstName(firstName);
	}
  
	
	
	
	@GetMapping("/searchEmp")
	
	public List<Employee> searchEmp (@RequestParam String firstName, @RequestParam String lastName){
		
		return empservices.serachEmp(firstName, lastName);
	}
	
    
  @PostMapping("/employees")
  
  public String addEmp(@RequestBody Employee emp)
  {
	  empservices.addEmp(emp);
	  
	  return "done";
  }
	
  
  @PutMapping ("/employees")
  public String updateEmp( @RequestBody Employee emp) {
	
	  empservices.updateEmp(emp);
	  
	  return "updated Done ya 7g";
  }
	
  @PutMapping("/updatebyId")
  public String updateEmpById(@RequestParam Long id)
  {
	  
	  empservices.updateEmpbyid(id);
	  
	  return "Yes";
  }
  
 @DeleteMapping ("/employees")
  public String deleteEmp(@RequestParam Long id)
 {
	 
	 empservices.deleteEmp(id);
	 return "deleted Done";
 }
 
 
 @GetMapping("/department/{deptId}/employees")
	public List<Employee> getDeptEmp( @PathVariable Long deptId)
	{
	
//	 System.out.println(filePath);
//	 System.out.println(appName);
	 return empservices.getDeptEmps(deptId);
	}

  
}
