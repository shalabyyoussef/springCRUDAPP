package com.hr.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@Table (name= "Employees")
@Table (name= "EMPLOYEES")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Employee {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name= "EMPLOYEE_ID")
	private long id;
	
	
	private double salary;
	
	@Column (name= "FIRST_NAME")
    private String firstName;
    
	@Column (name= "LAST_NAME")
    private String lastName;
    
	
    private String address;
    
    @ManyToOne (cascade = CascadeType.ALL)
//    @JoinColumn (name = "department_id")
    private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(long id, double salary, String firstName, String lastName, String address, Department department) {
		super();
		this.id = id;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.department=department;
	}

	public Employee() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
}
