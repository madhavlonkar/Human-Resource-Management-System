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

import com.HRMS.model.DeductionMaster;
import com.HRMS.services.DeductionService;

@RestController
public class DeductionController {

	@Autowired
	private DeductionService dedcutionservice;
	
	@GetMapping("/deduction")
	public ResponseEntity<List<DeductionMaster>> getdeduction()
	{
		List<DeductionMaster> getdeduction = this.dedcutionservice.getdeduction();
		if(getdeduction.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.ok().body(getdeduction);
	}
	
	@GetMapping("/deduction/{deduction_id}")
	public ResponseEntity<DeductionMaster> getdeduction(@PathVariable("deduction_id") int deductionid)
	{
		DeductionMaster getdeductionbyid = dedcutionservice.getdeductionbyid(deductionid);;
		if(getdeductionbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(getdeductionbyid);
		
		
	}
	
	@PostMapping("/deduction")
	public ResponseEntity<DeductionMaster> adddeduction(@RequestBody DeductionMaster deduction)
	{
		DeductionMaster adddeduction = null;
		
		try
		{
			adddeduction=dedcutionservice.adddeduction(deduction);
			return ResponseEntity.ok().body(adddeduction);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}

	
	@PutMapping("/deduction/{deduction_id}")
	public ResponseEntity<DeductionMaster> updatededuction(@RequestBody DeductionMaster deduction,@PathVariable("deduction_id") int deduction_id)
	{
		DeductionMaster updatebook =null;
		DeductionMaster getdeductionbyid = dedcutionservice.getdeductionbyid(deduction_id);;
		if(getdeductionbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try
		{
			updatebook=dedcutionservice.updatebook(deduction,deduction_id);
			return ResponseEntity.ok().body(updatebook);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		 
		
	}
	
	@DeleteMapping("/deduction/{deduction_id}")
	public ResponseEntity<Void> deletededuction(@PathVariable("deduction_id") int deduction_id)
	{
		DeductionMaster getdeductionbyid = dedcutionservice.getdeductionbyid(deduction_id);;
		if(getdeductionbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try
		{
			dedcutionservice.deletededuction(deduction_id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
}
