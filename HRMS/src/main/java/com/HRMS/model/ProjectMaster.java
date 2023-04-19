package com.HRMS.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_project")
public class ProjectMaster {

	@Id
	int project_id;
	String project_name;
	String project_desc;
	
	int client_id;
	String client_name;
	String currency;
	String loaction;
	
	int manager_id;
	int hr_id;
	
	Date start_date;
	Date end_date;
	
	String Status;

	/**
	 * @return the project_id
	 */
	public int getProject_id() {
		return project_id;
	}

	/**
	 * @return the project_name
	 */
	public String getProject_name() {
		return project_name;
	}

	/**
	 * @return the project_desc
	 */
	public String getProject_desc() {
		return project_desc;
	}

	/**
	 * @return the client_id
	 */
	public int getClient_id() {
		return client_id;
	}

	/**
	 * @return the client_name
	 */
	public String getClient_name() {
		return client_name;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @return the loaction
	 */
	public String getLoaction() {
		return loaction;
	}

	/**
	 * @return the manager_id
	 */
	public int getManager_id() {
		return manager_id;
	}

	/**
	 * @return the hr_id
	 */
	public int getHr_id() {
		return hr_id;
	}

	/**
	 * @return the start_date
	 */
	public Date getStart_date() {
		return start_date;
	}

	/**
	 * @return the end_date
	 */
	public Date getEnd_date() {
		return end_date;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}

	/**
	 * @param project_id the project_id to set
	 */
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	/**
	 * @param project_name the project_name to set
	 */
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	/**
	 * @param project_desc the project_desc to set
	 */
	public void setProject_desc(String project_desc) {
		this.project_desc = project_desc;
	}

	/**
	 * @param client_id the client_id to set
	 */
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	/**
	 * @param client_name the client_name to set
	 */
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @param loaction the loaction to set
	 */
	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}

	/**
	 * @param manager_id the manager_id to set
	 */
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	/**
	 * @param hr_id the hr_id to set
	 */
	public void setHr_id(int hr_id) {
		this.hr_id = hr_id;
	}

	/**
	 * @param start_date the start_date to set
	 */
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	/**
	 * @param end_date the end_date to set
	 */
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}

	/**
	 * @param project_id
	 * @param project_name
	 * @param project_desc
	 * @param client_id
	 * @param client_name
	 * @param currency
	 * @param loaction
	 * @param manager_id
	 * @param hr_id
	 * @param start_date
	 * @param end_date
	 * @param status
	 */
	public ProjectMaster(int project_id, String project_name, String project_desc, int client_id, String client_name,
			String currency, String loaction, int manager_id, int hr_id, Date start_date, Date end_date,
			String status) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.project_desc = project_desc;
		this.client_id = client_id;
		this.client_name = client_name;
		this.currency = currency;
		this.loaction = loaction;
		this.manager_id = manager_id;
		this.hr_id = hr_id;
		this.start_date = start_date;
		this.end_date = end_date;
		Status = status;
	}

	/**
	 * 
	 */
	public ProjectMaster() {
		super();
	}
	
	public ProjectMaster(int project_id) {
		super();
		this.project_id=project_id;
	}

	@Override
	public String toString() {
		return "ProjectMaster [project_id=" + project_id + ", project_name=" + project_name + ", project_desc="
				+ project_desc + ", client_id=" + client_id + ", client_name=" + client_name + ", currency=" + currency
				+ ", loaction=" + loaction + ", manager_id=" + manager_id + ", hr_id=" + hr_id + ", start_date="
				+ start_date + ", end_date=" + end_date + ", Status=" + Status + "]";
	}
	
	
	
	
}
