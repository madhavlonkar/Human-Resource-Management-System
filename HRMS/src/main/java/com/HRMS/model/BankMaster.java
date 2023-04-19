package com.HRMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BankMaster")
public class BankMaster {
	
	@Id
	@Column(name="bank_id")
	private int bank_id;
	
	@Column(name="bank_name")
	private String bank_name;
	
	@Column(name="bank_branch")
	private String bank_branch;
	
	@Column(name="bank_description")
	private String bank_desc;

	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBank_branch() {
		return bank_branch;
	}

	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}

	public String getBank_desc() {
		return bank_desc;
	}

	public void setBank_desc(String bank_desc) {
		this.bank_desc = bank_desc;
	}

	public BankMaster(int bank_id, String bank_name, String bank_branch, String bank_desc) {
		super();
		this.bank_id = bank_id;
		this.bank_name = bank_name;
		this.bank_branch = bank_branch;
		this.bank_desc = bank_desc;
	}

	public BankMaster() {
		super();
	}
	 
	public BankMaster(int bank_id) {
		super();
		this.bank_id=bank_id;
	}
	
	@Override
	public String toString() {
		return "BankMaster [bank_id=" + bank_id + ", bank_name=" + bank_name + ", bank_branch=" + bank_branch
				+ ", bank_desc=" + bank_desc + "]";
	}
	
	


}
