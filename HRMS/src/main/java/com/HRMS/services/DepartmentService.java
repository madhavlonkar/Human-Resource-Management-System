package com.HRMS.services;

import java.util.List;

import com.HRMS.model.DepartmentMaster;

public interface DepartmentService {

	List<DepartmentMaster> getalldepartment();
	DepartmentMaster finddepartmentbyid(int department_id);
	DepartmentMaster adddepartment(DepartmentMaster department);
	DepartmentMaster updatedepartment(int department_id, DepartmentMaster department);
	void deletedepartment(int department_id);

}
