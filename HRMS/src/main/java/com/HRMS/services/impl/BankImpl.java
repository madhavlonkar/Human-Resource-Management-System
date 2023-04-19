package com.HRMS.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.BankDAO;
import com.HRMS.model.BankMaster;
import com.HRMS.services.BankService;

@Service
public class BankImpl implements BankService{
	
	@Autowired
	private BankDAO bankdao;

	@Override
	public List<BankMaster> getbanks() {
		try
		{
			List<BankMaster> findAll = (List<BankMaster>) this.bankdao.findAll();
			return findAll;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		 
		
	}

	@Override
	public BankMaster addbank(BankMaster bank) {
		try {
			BankMaster addbank=this.bankdao.save(bank);
			return addbank;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	public BankMaster getbanks(int bank_id) {
		try {
			BankMaster findById = this.bankdao.findById(bank_id);
			return findById;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void deletebank(int bank_id) {
		try {
			bankdao.deleteById(bank_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public BankMaster updatebank(BankMaster bank, int bank_id) {
		try {
			bank.setBank_id(bank_id);
			BankMaster updatebank = this.bankdao.save(bank);
			return updatebank;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	

}
