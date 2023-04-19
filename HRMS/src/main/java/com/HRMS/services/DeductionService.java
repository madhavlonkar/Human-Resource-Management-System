package com.HRMS.services;

import java.util.List;

import com.HRMS.model.DeductionMaster;


public interface DeductionService {

	List<DeductionMaster> getdeduction();
	DeductionMaster getdeductionbyid(int deductionid);
	DeductionMaster adddeduction(DeductionMaster deduction);
	DeductionMaster updatebook(DeductionMaster deduction, int deduction_id);
	void deletededuction(int deduction_id);


}
