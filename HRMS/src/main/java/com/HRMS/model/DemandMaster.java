package com.HRMS.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tbl_Demand")
public class DemandMaster {

    @Id
    @Column(name ="DemandID")
    private int demand_id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectMaster project_id;

    @Column(name = "DemandType")
    private String demand_type;

    @Column(name = "Qualification_id")
    private int qualification_id;

    @OneToOne
    @JoinColumn(name = "DemandDesignation")
    private DesignationMaster demand_designation;

    @Column(name = "DemandJobDesc")
    private String demand_job_desc;

    @Column(name = "NoOfPosition")
    private String no_of_position;

    @Column(name = "Post_Date")
    private Date post_date;

    @Column(name = "Start_Date")
    private Date start_date;

    @Column(name = "Close_Date")
    private Date close_date;

    @Column(name = "Status")
    private String status;

    @Column(name = "Mode")
    private String mode;

    @Column(name = "Skills")
    private String skills;

	/**
	 * @return the demand_id
	 */
	public int getDemand_id() {
		return demand_id;
	}

	/**
	 * @return the project_id
	 */
	public ProjectMaster getProject_id() {
		return project_id;
	}

	/**
	 * @return the demand_type
	 */
	public String getDemand_type() {
		return demand_type;
	}

	/**
	 * @return the qualification_id
	 */
	public int getQualification_id() {
		return qualification_id;
	}

	/**
	 * @return the demand_designation
	 */
	public DesignationMaster getDemand_designation() {
		return demand_designation;
	}

	/**
	 * @return the demand_job_desc
	 */
	public String getDemand_job_desc() {
		return demand_job_desc;
	}

	/**
	 * @return the no_of_position
	 */
	public String getNo_of_position() {
		return no_of_position;
	}

	/**
	 * @return the post_date
	 */
	public Date getPost_date() {
		return post_date;
	}

	/**
	 * @return the start_date
	 */
	public Date getStart_date() {
		return start_date;
	}

	/**
	 * @return the close_date
	 */
	public Date getClose_date() {
		return close_date;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skills;
	}

	/**
	 * @param demand_id the demand_id to set
	 */
	public void setDemand_id(int demand_id) {
		this.demand_id = demand_id;
	}

	/**
	 * @param project_id the project_id to set
	 */
	public void setProject_id(ProjectMaster project_id) {
		this.project_id = project_id;
	}

	/**
	 * @param demand_type the demand_type to set
	 */
	public void setDemand_type(String demand_type) {
		this.demand_type = demand_type;
	}

	/**
	 * @param qualification_id the qualification_id to set
	 */
	public void setQualification_id(int qualification_id) {
		this.qualification_id = qualification_id;
	}

	/**
	 * @param demand_designation the demand_designation to set
	 */
	public void setDemand_designation(DesignationMaster demand_designation) {
		this.demand_designation = demand_designation;
	}

	/**
	 * @param demand_job_desc the demand_job_desc to set
	 */
	public void setDemand_job_desc(String demand_job_desc) {
		this.demand_job_desc = demand_job_desc;
	}

	/**
	 * @param no_of_position the no_of_position to set
	 */
	public void setNo_of_position(String no_of_position) {
		this.no_of_position = no_of_position;
	}

	/**
	 * @param post_date the post_date to set
	 */
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}

	/**
	 * @param start_date the start_date to set
	 */
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	/**
	 * @param close_date the close_date to set
	 */
	public void setClose_date(Date close_date) {
		this.close_date = close_date;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "DemandMaster [demand_id=" + demand_id + ", project_id=" + project_id + ", demand_type=" + demand_type
				+ ", qualification_id=" + qualification_id + ", demand_designation=" + demand_designation
				+ ", demand_job_desc=" + demand_job_desc + ", no_of_position=" + no_of_position + ", post_date="
				+ post_date + ", start_date=" + start_date + ", close_date=" + close_date + ", status=" + status
				+ ", mode=" + mode + ", skills=" + skills + "]";
	}

	/**
	 * @param demand_id
	 * @param project_id
	 * @param demand_type
	 * @param qualification_id
	 * @param demand_designation
	 * @param demand_job_desc
	 * @param no_of_position
	 * @param post_date
	 * @param start_date
	 * @param close_date
	 * @param status
	 * @param mode
	 * @param skills
	 */
	public DemandMaster(int demand_id, ProjectMaster project_id, String demand_type, int qualification_id,
			DesignationMaster demand_designation, String demand_job_desc, String no_of_position, Date post_date,
			Date start_date, Date close_date, String status, String mode, String skills) {
		super();
		this.demand_id = demand_id;
		this.project_id = project_id;
		this.demand_type = demand_type;
		this.qualification_id = qualification_id;
		this.demand_designation = demand_designation;
		this.demand_job_desc = demand_job_desc;
		this.no_of_position = no_of_position;
		this.post_date = post_date;
		this.start_date = start_date;
		this.close_date = close_date;
		this.status = status;
		this.mode = mode;
		this.skills = skills;
	}

	/**
	 * 
	 */
	public DemandMaster() {
		super();
	}
	
	public DemandMaster(int demand_id) {
		super();
		this.demand_id=demand_id;
	}
    
    
}
