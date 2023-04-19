package com.HRMS.controller;

import java.util.List;
import java.util.Optional;

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

import com.HRMS.model.DesignationMaster;
import com.HRMS.services.DesignationService;

@RestController
public class DesignationController {

	@Autowired
	private DesignationService designationservice;
	
	@GetMapping("/designation")
	public ResponseEntity<List<DesignationMaster>> getDesignation()
	{
		List<DesignationMaster> alldesignation = designationservice.getAllDesigantion();
		if(alldesignation.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(alldesignation));
	}
	
	
	@GetMapping("/designation/{designation_id}")
	public ResponseEntity<DesignationMaster> getDesigantion(@PathVariable("designation_id") int designation_id)
	{
		DesignationMaster designationbyid = designationservice.getDesigantionById(designation_id);
		if(designationbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(designationbyid);
		
	}
	
	@PostMapping("/designation")
	public ResponseEntity<DesignationMaster> addDesigantion(@RequestBody DesignationMaster designation)
	{
		DesignationMaster addDesigantion=null; 
		
		try
		{
			addDesigantion=this.designationservice.addDesigantion(designation);
		return ResponseEntity.ok().body(addDesigantion);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@PutMapping("designation/{designation_id}")
	public ResponseEntity<DesignationMaster> updatedesignation(@RequestBody DesignationMaster designation,@PathVariable("designation_id") int designation_id)
	{
		DesignationMaster designation1=null;
			
		
		DesignationMaster designationbyid = designationservice.getDesigantionById(designation_id);
		if(designationbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try
		{
			designation1=designationservice.updateDesigantion(designation,designation_id);
			return ResponseEntity.ok().body(designation1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
	
	@DeleteMapping("/designation/{designation_id}")
	public ResponseEntity<Void> deletedesignation(@PathVariable("designation_id") int designation_id)
	{
		DesignationMaster designationbyid = designationservice.getDesigantionById(designation_id);
		if(designationbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try
		{
			this.designationservice.deleteDesigantion(designation_id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
