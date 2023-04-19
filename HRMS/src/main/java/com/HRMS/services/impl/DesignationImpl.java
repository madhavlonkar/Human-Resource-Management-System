package com.HRMS.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.DesignationDAO;
import com.HRMS.model.DesignationMaster;
import com.HRMS.services.DesignationService;

@Service
public class DesignationImpl implements DesignationService {

	@Autowired
	private DesignationDAO deisgnationdao;
	
	@Override
	public List<DesignationMaster> getAllDesigantion() {
		List<DesignationMaster> findAll = null;
		try {
			findAll = (List<DesignationMaster>) deisgnationdao.findAll();
			return findAll;
		} catch (Exception e) {
			e.printStackTrace();
			return findAll;
		}
	}

	@Override
	public DesignationMaster getDesigantionById(int designation_id) {
		DesignationMaster findById = null;
		try {
			
			findById = deisgnationdao.findById(designation_id);
			return findById;

		} catch (Exception e) {
			e.printStackTrace();
			return findById;
		}
	}

	@Override
	public DesignationMaster addDesigantion(DesignationMaster designation) {
		DesignationMaster designationsaved=null;
		try {
			designationsaved= deisgnationdao.save(designation);
			return designationsaved;
			
		} catch (Exception e) {
			e.printStackTrace();
			return designationsaved;
		}
	}

	@Override
	public DesignationMaster updateDesigantion(DesignationMaster designation, int designation_id) {
		DesignationMaster updateddesignation=null;
		try
		{
			designation.setDesignation_id(designation_id);
			updateddesignation = deisgnationdao.save(designation);
			return updateddesignation;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return updateddesignation;
		}
	}

	@Override
	public void deleteDesigantion(int designation_id) {
		try
		{
			deisgnationdao.deleteById(designation_id);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	

}
