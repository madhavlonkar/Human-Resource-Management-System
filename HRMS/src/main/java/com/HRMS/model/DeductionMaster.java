package com.HRMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="deduction_master")
public class DeductionMaster {
	
	@Id
	@Column(name="deduction_id")
	private int deduction_id;
	
	@Column(name="deduction_name")
	private String deduction_name;
	
	@Column(name="deduction_description")
	private String deduction_description;

	public int getDeduction_id() {
		return deduction_id;
	}

	public void setDeduction_id(int deduction_id) {
		this.deduction_id = deduction_id;
	}

	public String getDeduction_name() {
		return deduction_name;
	}

	public void setDeduction_name(String deduction_name) {
		this.deduction_name = deduction_name;
	}

	public String getDeduction_description() {
		return deduction_description;
	}

	public void setDeduction_description(String deduction_description) {
		this.deduction_description = deduction_description;
	}

	public DeductionMaster(int deduction_id, String deduction_name, String deduction_description) {
		super();
		this.deduction_id = deduction_id;
		this.deduction_name = deduction_name;
		this.deduction_description = deduction_description;
	}

	public DeductionMaster() {
		super();
	}

	@Override
	public String toString() {
		return "DeductionMaster [deduction_id=" + deduction_id + ", deduction_name=" + deduction_name
				+ ", deduction_description=" + deduction_description + "]";
	}
	
	
	
}
