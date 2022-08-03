package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Department;

import com.hr.service.DepartmentServices;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

	@Autowired
	private DepartmentServices deptservices;

	@GetMapping("/departments")
	public List<Department> getAllDept() {
		
		System.out.print("acess");

		return deptservices.getAllDepts();
	}

	@GetMapping("/getDeptBYID/{id}")
	public Department getDeptBYID(@PathVariable long id) {
		return deptservices.getDeptBYID(id);
	}

	@PostMapping("/deptartments")

	public String addDept(@RequestBody Department dept) {
		deptservices.addDept(dept);

		return "done";
	}

	@PutMapping("/departments")
	public String updateDept(@RequestBody Department dept) {

		deptservices.updateDept(dept);

		return "updated Done ya 7g";
	}

	@DeleteMapping("/departments")
	public String deleteDept(@RequestParam Long id) {

		deptservices.deletedept(id);
		return "deleted Done";
	}

}
