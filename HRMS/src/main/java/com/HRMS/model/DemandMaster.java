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
    private int project_id;

    @Column(name = "DemandType")
    private String demand_type;

    @Column(name = "Qualification_id")
    private int qualification_id;

    @Column(name = "DemandDesignation")
    private String demand_designation;

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
     * @param demand_id the demand_id to set
     */
    public void setDemand_id(int demand_id) {
        this.demand_id = demand_id;
    }
    /**
     * @return the project_id
     */
    public int getProject_id() {
        return project_id;
    }
    /**
     * @param project_id the project_id to set
     */
    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }
    /**
     * @return the demand_type
     */
    public String getDemand_type() {
        return demand_type;
    }
    /**
     * @param demand_type the demand_type to set
     */
    public void setDemand_type(String demand_type) {
        this.demand_type = demand_type;
    }
    /**
     * @return the qualification_id
     */
    public int getQualification_id() {
        return qualification_id;
    }
    /**
     * @param qualification_id the qualification_id to set
     */
    public void setQualification_id(int qualification_id) {
        this.qualification_id = qualification_id;
    }
    /**
     * @return the demand_designation
     */
    public String getDemand_designation() {
        return demand_designation;
    }
    /**
     * @param demand_designation the demand_designation to set
     */
    public void setDemand_designation(String demand_designation) {
        this.demand_designation = demand_designation;
    }
    /**
     * @return the demand_job_desc
     */
    public String getDemand_job_desc() {
        return demand_job_desc;
    }
    /**
     * @param demand_job_desc the demand_job_desc to set
     */
    public void setDemand_job_desc(String demand_job_desc) {
        this.demand_job_desc = demand_job_desc;
    }
    /**
     * @return the no_of_position
     */
    public String getNo_of_position() {
        return no_of_position;
    }
    /**
     * @param no_of_position the no_of_position to set
     */
    public void setNo_of_position(String no_of_position) {
        this.no_of_position = no_of_position;
    }
    /**
     * @return the post_date
     */
    public Date getPost_date() {
        return post_date;
    }
    /**
     * @param post_date the post_date to set
     */
    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }
    /**
     * @return the start_date
     */
    public Date getStart_date() {
        return start_date;
    }
    /**
     * @param start_date the start_date to set
     */
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }
    /**
     * @return the close_date
     */
    public Date getClose_date() {
        return close_date;
    }
    /**
     * @param close_date the close_date to set
     */
    public void setClose_date(Date close_date) {
        this.close_date = close_date;
    }
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }
    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * @return the mode
     */
    public String getMode() {
        return mode;
    }
    /**
     * @param mode the mode to set
     */
    public void setMode(String mode) {
        this.mode = mode;
    }
    /**
     * @return the skills
     */
    public String getSkills() {
        return skills;
    }
    /**
     * @param skills the skills to set
     */
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public DemandMaster(int demand_id, int project_id, String demand_type, int qualification_id,
                        String demand_designation, String demand_job_desc, String no_of_position, Date post_date, Date start_date,
                        Date close_date, String status, String mode, String skills) {
        super();
        this.demand_id = demand_id;
        this.project_id= project_id;
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
    public DemandMaster() {
        super();
    }
    @Override
    public String toString() {
        return "DemandMaster [demand_id=" + demand_id + ", project_id=" + project_id + ", demand_type=" + demand_type
                + ", qualification_id=" + qualification_id + ", demand_designation=" + demand_designation
                + ", demand_job_desc=" + demand_job_desc + ", no_of_position=" + no_of_position + ", post_date="
                + post_date + ", start_date=" + start_date + ", close_date=" + close_date + ", status=" + status
                + ", mode=" + mode + ", skills=" + skills + "]";
    }
}
