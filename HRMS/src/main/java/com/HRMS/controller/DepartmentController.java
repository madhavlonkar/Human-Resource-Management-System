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

import com.HRMS.model.DepartmentMaster;
import com.HRMS.services.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentservice;
	
	@GetMapping("/department")
	public ResponseEntity<List<DepartmentMaster>> getalldepartment()
	{
		List<DepartmentMaster> getalldepartment = this.departmentservice.getalldepartment();
		if(getalldepartment.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.ok().body(getalldepartment);
	}
	
	@GetMapping("/department/{department_id}")
	public ResponseEntity<DepartmentMaster> findbyid(@PathVariable("department_id") int department_id)
	{
		DepartmentMaster finddepartmentbyid = this.departmentservice.finddepartmentbyid(department_id);
		if(finddepartmentbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok().body(finddepartmentbyid);
	}
	
	@PostMapping("/department")
	public ResponseEntity<DepartmentMaster> adddepartment(@RequestBody DepartmentMaster department)
	{
		DepartmentMaster adddepartment = this.departmentservice.adddepartment(department);
		if(adddepartment==null)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().body(adddepartment);
	}
	
	@PutMapping("/department/{department_id}")
	public ResponseEntity<DepartmentMaster> updatedepartment(@PathVariable("department_id") int department_id,@RequestBody DepartmentMaster department)
	{
		DepartmentMaster finddepartmentbyid = this.departmentservice.finddepartmentbyid(department_id);
		if(finddepartmentbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		DepartmentMaster updatedepartment = this.departmentservice.updatedepartment(department_id,department);
		if(updatedepartment==null)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().body(updatedepartment);
		
	}
	
	@DeleteMapping("/department/{department_id}")
	public ResponseEntity<Void> deletedepartment(@PathVariable("department_id") int department_id)
	{
		
		DepartmentMaster finddepartmentbyid = this.departmentservice.finddepartmentbyid(department_id);
		if(finddepartmentbyid==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try
		{
			this.departmentservice.deletedepartment(department_id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
			
}
