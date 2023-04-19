package com.HRMS.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.DeductionDAO;
import com.HRMS.model.DeductionMaster;
import com.HRMS.services.DeductionService;

@Service
public class DeductionImpl implements DeductionService {

	@Autowired
	private DeductionDAO deductiondao;

	@Override
	public List<DeductionMaster> getdeduction() {
		try {
			List<DeductionMaster> findAll = (List<DeductionMaster>) deductiondao.findAll();
			return findAll;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public DeductionMaster getdeductionbyid(int deductionid) {

		try {
			DeductionMaster findById = deductiondao.findById(deductionid);
			return findById;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public DeductionMaster adddeduction(DeductionMaster deduction) {
		try
		{
			DeductionMaster addbook = deductiondao.save(deduction);
			return addbook;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		

	}

	@Override
	public DeductionMaster updatebook(DeductionMaster deduction, int deduction_id) {
		
		try
		{
			deduction.setDeduction_id(deduction_id);
			DeductionMaster updateddeduction = deductiondao.save(deduction);
			return updateddeduction;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		

	}

	@Override
	public void deletededuction(int deduction_id) {
		try
		{
			deductiondao.deleteById(deduction_id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
