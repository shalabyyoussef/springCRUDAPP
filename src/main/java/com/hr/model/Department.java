package com.hr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "DEPARTMENTS")
//@Table (name= "deparments")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "DEPARTMENT_ID")
	Long id;
	
	@Column (name = "DEPARTMENT_NAME")
//	@Column (name = "deptName")
	String deptName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Department(Long id, String deptName) {
		super();
		this.id = id;
		this.deptName = deptName;
	}

	public Department() {
		
	}
	
	

}
