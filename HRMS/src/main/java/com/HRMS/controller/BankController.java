package com.HRMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.model.BankMaster;
import com.HRMS.services.BankService;

@RestController
public class BankController {
	
	@Autowired
	private BankService bankservice;
	
	@GetMapping("/bank")
	public ResponseEntity<List<BankMaster>> getbanks()
	{
		List<BankMaster> getbanks = this.bankservice.getbanks();
		if(getbanks.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(getbanks);
	}
	
	@GetMapping("/bank/{bank_id}")
	public ResponseEntity<BankMaster> getbankbyid(@PathVariable("bank_id") int bank_id)
	{
		BankMaster getbanks = this.bankservice.getbanks(bank_id);
		
		if(getbanks==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.ok().body(getbanks);
		
	}
	
	@PostMapping("/bank")
	public ResponseEntity<BankMaster> addbank(@RequestBody BankMaster bank)
	{
		try {
			
			BankMaster addbank = this.bankservice.addbank(bank);
			return ResponseEntity.ok().body(addbank);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@DeleteMapping("/bank/{bank_id}")
	public ResponseEntity<Void> deletebank(@PathVariable("bank_id") int bank_id)
	{
		BankMaster getbanks = this.bankservice.getbanks(bank_id);
		if(getbanks==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try {
			
			bankservice.deletebank(bank_id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@PutMapping("/bank/{bank_id}")
	public ResponseEntity<BankMaster> updatebank(@RequestBody BankMaster bank,@PathVariable("bank_id") int bank_id)
	{
		BankMaster updatebank = null;
		BankMaster getbanks = this.bankservice.getbanks(bank_id);
		if(getbanks==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try {
			updatebank= this.bankservice.updatebank(bank,bank_id);
			return ResponseEntity.ok().body(updatebank);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}

	

}
