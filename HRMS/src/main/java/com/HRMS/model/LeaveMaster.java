package com.HRMS.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Leave_Master")
public class LeaveMaster {
	
	@Id
	@Column(name="leaveid")
	private int leaveid;
	
	@OneToOne
	@JoinColumn(name="empid")
	private EmployeeMaster empid;

	@Column(name="leave_from")
	private Date leave_from;
	
	@Column(name="leave_to")
	private Date leave_to;
	
	@Column(name="leave_type")
	private String leave_type;
	
	@Column(name="leave_reason")
	private String leavereason;

	public int getLeaveid() {
		return leaveid;
	}

	public void setLeaveid(int leaveid) {
		this.leaveid = leaveid;
	}

	public EmployeeMaster getEmpid() {
		return empid;
	}

	public void setEmpid(EmployeeMaster empid) {
		this.empid = empid;
	}

	public Date getLeave_from() {
		return leave_from;
	}

	public void setLeave_from(Date leave_from) {
		this.leave_from = leave_from;
	}

	public Date getLeave_to() {
		return leave_to;
	}

	public void setLeave_to(Date leave_to) {
		this.leave_to = leave_to;
	}

	public String getLeave_type() {
		return leave_type;
	}

	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}

	public String getLeavereason() {
		return leavereason;
	}

	public void setLeavereason(String leavereason) {
		this.leavereason = leavereason;
	}

	public LeaveMaster(int leaveid, EmployeeMaster empid, Date leave_from, Date leave_to, String leave_type, String leavereason) {
		super();
		this.leaveid = leaveid;
		this.empid = empid;
		this.leave_from = leave_from;
		this.leave_to = leave_to;
		this.leave_type = leave_type;
		this.leavereason = leavereason;
	}

	public LeaveMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LeaveMaster [leaveid=" + leaveid + ", empid=" + empid + ", leave_from=" + leave_from + ", leave_to="
				+ leave_to + ", leave_type=" + leave_type + ", leavereason=" + leavereason + "]";
	}
	
	
	

}
