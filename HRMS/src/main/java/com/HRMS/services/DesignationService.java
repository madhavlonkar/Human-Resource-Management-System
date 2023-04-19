package com.HRMS.services;

import java.util.List;

import com.HRMS.model.DesignationMaster;

public interface DesignationService {

	List<DesignationMaster> getAllDesigantion();
	DesignationMaster getDesigantionById(int designation_id);
	DesignationMaster addDesigantion(DesignationMaster designation);
	DesignationMaster updateDesigantion(DesignationMaster designation, int designation_id);
	void deleteDesigantion(int designation_id);
}
