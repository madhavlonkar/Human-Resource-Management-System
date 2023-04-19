package com.HRMS.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.DepartmentDAO;
import com.HRMS.model.DepartmentMaster;
import com.HRMS.services.DepartmentService;

@Service
public class DepartmentImpl implements DepartmentService{

	@Autowired
	private DepartmentDAO departmentdao;
	
	@Override
	public List<DepartmentMaster> getalldepartment() {
		try {
			List<DepartmentMaster> findAll = (List<DepartmentMaster>) this.departmentdao.findAll();
			return findAll;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public DepartmentMaster finddepartmentbyid(int department_id) {
		try {
			DepartmentMaster findById = this.departmentdao.findById(department_id);
			return findById;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public DepartmentMaster adddepartment(DepartmentMaster department) {
		
		try {
			DepartmentMaster departmentMaster = this.departmentdao.save(department);
			return departmentMaster;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}

	@Override
	public DepartmentMaster updatedepartment(int department_id, DepartmentMaster department) {
		
		try {
			department.setDepartment_id(department_id);
			DepartmentMaster updatedepartment = this.departmentdao.save(department);
			return updatedepartment;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}

	@Override
	public void deletedepartment(int department_id) {
		try {
			this.departmentdao.deleteById(department_id);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	

}
