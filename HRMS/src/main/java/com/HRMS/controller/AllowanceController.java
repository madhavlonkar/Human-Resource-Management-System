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

import com.HRMS.model.AllowanceMaster;
import com.HRMS.services.AllowanceService;

@RestController
public class AllowanceController {

	@Autowired
	private AllowanceService allowanceService; // Service for Allowance

	// Get All Allowances
	@GetMapping("/allowances")
	public ResponseEntity<List<AllowanceMaster>> getAllAllowances() {
		List<AllowanceMaster> allAllowances = allowanceService.getAllAllowances();
		
		// If there are no allowances, return not found
		if (allAllowances.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		// Return all the allowances
		return ResponseEntity.of(Optional.of(allAllowances));
	}

	// Get Allowance by Id
	@GetMapping("/allowances/{id}")
	public ResponseEntity<AllowanceMaster> getAllowanceById(@PathVariable("id") int id) {
		AllowanceMaster allowanceById = allowanceService.getAllowanceById(id);

		// If there's no allowance with that id, return not found
		if (allowanceById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		// Return the allowance with that id
		return ResponseEntity.ok().body(allowanceById);
	}

	// Add an Allowance
	@PostMapping("/allowances")
	public ResponseEntity<AllowanceMaster> addAllowance(@RequestBody AllowanceMaster allowance) {
		AllowanceMaster addedAllowance = null;

		try {
			// Try to add the allowance
			addedAllowance = allowanceService.addAllowance(allowance);
			return ResponseEntity.ok().body(addedAllowance);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	// Update an Allowance
	@PutMapping("allowances/{id}")
	public ResponseEntity<AllowanceMaster> updateAllowance(@RequestBody AllowanceMaster allowance, @PathVariable int id) {
		AllowanceMaster updatedAllowance = null;

		AllowanceMaster allowanceById = allowanceService.getAllowanceById(id);
		
		// If there's no allowance with that id, return not found
		if (allowanceById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		try {
			// Try to update the allowance
			updatedAllowance = allowanceService.updateAllowance(allowance, id);
			return ResponseEntity.ok().body(updatedAllowance);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	// Delete an Allowance
	@DeleteMapping("/allowances/{id}")
	public ResponseEntity<Void> deleteAllowance(@PathVariable("id") int id) {
		AllowanceMaster allowanceById = allowanceService.getAllowanceById(id);

		// If there's no allowance with that id, return not found
		if (allowanceById == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		try
		{
			this.allowanceService.deleteAllowance(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}

}
