package com.HRMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department_master")
public class DepartmentMaster {

	@Id
	@Column(name="department_id")
	private int department_id;
	
	@Column(name="department_name")
	private String department_name;
	
	@Column(name="department_location")
	private String department_location;
	
	@Column(name="department_description")
	private String department_description;

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getDepartment_location() {
		return department_location;
	}

	public void setDepartment_location(String department_location) {
		this.department_location = department_location;
	}

	public String getDepartment_description() {
		return department_description;
	}

	public void setDepartment_description(String department_description) {
		this.department_description = department_description;
	}

	public DepartmentMaster(int department_id, String department_name, String department_location,
			String department_description) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.department_location = department_location;
		this.department_description = department_description;
	}

	public DepartmentMaster() {
		super();
	}
	
	public DepartmentMaster(int department_id) {
		super();
		this.department_id=department_id;
	}

	@Override
	public String toString() {
		return "DepartmentMaster [department_id=" + department_id + ", department_name=" + department_name
				+ ", department_location=" + department_location + ", department_description=" + department_description
				+ "]";
	}
	
	
	

}
