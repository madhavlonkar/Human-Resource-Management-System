package com.HRMS.services;

import java.util.List;

import com.HRMS.model.BankMaster;

public interface BankService {

	List<BankMaster> getbanks();
	BankMaster addbank(BankMaster bank);
	BankMaster getbanks(int bank_id);
	void deletebank(int bank_id);
	BankMaster updatebank(BankMaster bank, int bank_id);

	

}
