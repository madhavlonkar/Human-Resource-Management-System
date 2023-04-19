package com.HRMS.model;

import java.sql.Date;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Master")
public class EmployeeMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    
	@Column(nullable = false)
	@NotBlank(message = "Name Cant Be Blank")
    private String empName;
	
	@Column(nullable = false)
    private String empEmail;
	
	@Column(nullable = false)
    private String empPhonePrimary;
    private String empPhoneAlternative;
    
    @Column(nullable = false)
    private String empAddress;
    
    @Column(nullable = false)
    private Date dob;
    private String empPan;
    
    @Column(nullable = false)
    private String empAadhaarNo;
    
    @OneToOne
    @JoinColumn(name = "bank_id")
    private BankMaster bank_id;
    
    private String empBankAccNo;
    private String empGender;
    private Date doj;
    
    @OneToOne
    @JoinColumn(name="project_id")
    private ProjectMaster project_id;
    
    private String empResume;
    private String empStatus;
    
    @OneToOne
    @JoinColumn(name="department_id")
    private DepartmentMaster department_id;
    
    @OneToOne
    @JoinColumn(name="designation_id")
    private DesignationMaster designation_id;
    
    private String empQualification;
    private int demandId;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}
	/**
	 * @return the empPhonePrimary
	 */
	public String getEmpPhonePrimary() {
		return empPhonePrimary;
	}
	/**
	 * @return the empPhoneAlternative
	 */
	public String getEmpPhoneAlternative() {
		return empPhoneAlternative;
	}
	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @return the empPan
	 */
	public String getEmpPan() {
		return empPan;
	}
	/**
	 * @return the empAadhaarNo
	 */
	public String getEmpAadhaarNo() {
		return empAadhaarNo;
	}
	/**
	 * @return the bank_id
	 */
	public BankMaster getBank_id() {
		return bank_id;
	}
	/**
	 * @return the empBankAccNo
	 */
	public String getEmpBankAccNo() {
		return empBankAccNo;
	}
	/**
	 * @return the empGender
	 */
	public String getEmpGender() {
		return empGender;
	}
	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}
	/**
	 * @return the project_id
	 */
	public ProjectMaster getProject_id() {
		return project_id;
	}
	/**
	 * @return the empResume
	 */
	public String getEmpResume() {
		return empResume;
	}
	/**
	 * @return the empStatus
	 */
	public String getEmpStatus() {
		return empStatus;
	}
	/**
	 * @return the department_id
	 */
	public DepartmentMaster getDepartment_id() {
		return department_id;
	}
	/**
	 * @return the designation_id
	 */
	public DesignationMaster getDesignation_id() {
		return designation_id;
	}
	/**
	 * @return the empQualification
	 */
	public String getEmpQualification() {
		return empQualification;
	}
	/**
	 * @return the demandId
	 */
	public int getDemandId() {
		return demandId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	/**
	 * @param empPhonePrimary the empPhonePrimary to set
	 */
	public void setEmpPhonePrimary(String empPhonePrimary) {
		this.empPhonePrimary = empPhonePrimary;
	}
	/**
	 * @param empPhoneAlternative the empPhoneAlternative to set
	 */
	public void setEmpPhoneAlternative(String empPhoneAlternative) {
		this.empPhoneAlternative = empPhoneAlternative;
	}
	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @param empPan the empPan to set
	 */
	public void setEmpPan(String empPan) {
		this.empPan = empPan;
	}
	/**
	 * @param empAadhaarNo the empAadhaarNo to set
	 */
	public void setEmpAadhaarNo(String empAadhaarNo) {
		this.empAadhaarNo = empAadhaarNo;
	}
	/**
	 * @param bank_id the bank_id to set
	 */
	public void setBank_id(BankMaster bank_id) {
		this.bank_id = bank_id;
	}
	/**
	 * @param empBankAccNo the empBankAccNo to set
	 */
	public void setEmpBankAccNo(String empBankAccNo) {
		this.empBankAccNo = empBankAccNo;
	}
	/**
	 * @param empGender the empGender to set
	 */
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	/**
	 * @param project_id the project_id to set
	 */
	public void setProject_id(ProjectMaster project_id) {
		this.project_id = project_id;
	}
	/**
	 * @param empResume the empResume to set
	 */
	public void setEmpResume(String empResume) {
		this.empResume = empResume;
	}
	/**
	 * @param empStatus the empStatus to set
	 */
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	/**
	 * @param department_id the department_id to set
	 */
	public void setDepartment_id(DepartmentMaster department_id) {
		this.department_id = department_id;
	}
	/**
	 * @param designation_id the designation_id to set
	 */
	public void setDesignation_id(DesignationMaster designation_id) {
		this.designation_id = designation_id;
	}
	/**
	 * @param empQualification the empQualification to set
	 */
	public void setEmpQualification(String empQualification) {
		this.empQualification = empQualification;
	}
	/**
	 * @param demandId the demandId to set
	 */
	public void setDemandId(int demandId) {
		this.demandId = demandId;
	}
	/**
	 * @param empId
	 * @param empName
	 * @param empEmail
	 * @param empPhonePrimary
	 * @param empPhoneAlternative
	 * @param empAddress
	 * @param dob
	 * @param empPan
	 * @param empAadhaarNo
	 * @param bank_id
	 * @param empBankAccNo
	 * @param empGender
	 * @param doj
	 * @param project_id
	 * @param empResume
	 * @param empStatus
	 * @param department_id
	 * @param designation_id
	 * @param empQualification
	 * @param demandId
	 */
	public EmployeeMaster(int empId, String empName, String empEmail, String empPhonePrimary,
			String empPhoneAlternative, String empAddress, Date dob, String empPan, String empAadhaarNo,
			BankMaster bank_id, String empBankAccNo, String empGender, Date doj, ProjectMaster project_id,
			String empResume, String empStatus, DepartmentMaster department_id, DesignationMaster designation_id,
			String empQualification, int demandId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPhonePrimary = empPhonePrimary;
		this.empPhoneAlternative = empPhoneAlternative;
		this.empAddress = empAddress;
		this.dob = dob;
		this.empPan = empPan;
		this.empAadhaarNo = empAadhaarNo;
		this.bank_id = bank_id;
		this.empBankAccNo = empBankAccNo;
		this.empGender = empGender;
		this.doj = doj;
		this.project_id = project_id;
		this.empResume = empResume;
		this.empStatus = empStatus;
		this.department_id = department_id;
		this.designation_id = designation_id;
		this.empQualification = empQualification;
		this.demandId = demandId;
	}
	/**
	 * 
	 */
	public EmployeeMaster() {
		super();
	}
	
	public EmployeeMaster(int empid) {
		super();
		this.empId=empid;
	}
	@Override
	public String toString() {
		return "EmployeeMaster [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail
				+ ", empPhonePrimary=" + empPhonePrimary + ", empPhoneAlternative=" + empPhoneAlternative
				+ ", empAddress=" + empAddress + ", dob=" + dob + ", empPan=" + empPan + ", empAadhaarNo="
				+ empAadhaarNo + ", bank_id=" + bank_id + ", empBankAccNo=" + empBankAccNo + ", empGender=" + empGender
				+ ", doj=" + doj + ", project_id=" + project_id + ", empResume=" + empResume + ", empStatus="
				+ empStatus + ", department_id=" + department_id + ", designation_id=" + designation_id
				+ ", empQualification=" + empQualification + ", demandId=" + demandId + "]";
	}

    
}
