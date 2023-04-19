package com.HRMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="designation_master")
public class DesignationMaster {

	@Id
	@Column(name="designation_id")
	private int designation_id;
	
	@Column(name="designation_name")
	private String designation_name;
	
	@Column(name="designation_description")
	private String designation_description;

	public int getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(int designation_id) {
		this.designation_id = designation_id;
	}

	public String getDesignation_name() {
		return designation_name;
	}

	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}

	public String getDesignation_description() {
		return designation_description;
	}

	public void setDesignation_description(String designation_description) {
		this.designation_description = designation_description;
	}

	public DesignationMaster(int designation_id, String designation_name, String designation_description) {
		super();
		this.designation_id = designation_id;
		this.designation_name = designation_name;
		this.designation_description = designation_description;
	}

	public DesignationMaster() {
		super();
	}
	
	public DesignationMaster(int designation_id) {
		super();
		this.designation_id=designation_id;
	}

	@Override
	public String toString() {
		return "DesignationMaster [designation_id=" + designation_id + ", designation_name=" + designation_name
				+ ", designation_description=" + designation_description + "]";
	}
	
	

}
