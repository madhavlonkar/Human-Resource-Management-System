package com.HRMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.model.OtpLoginMaster;
import com.HRMS.services.OtpLoginService;

@RestController
public class OtpLoginController {

	@Autowired
	private OtpLoginService otpLoginService;
	
	
	public void OtpSave(String username,int otp)
	{
		this.otpLoginService.saveotp(username,otp);
	}
	
	@PostMapping("/otpverification")
	public String otpcheck(@RequestBody OtpLoginMaster otpmaster)
	{
		String checkotp = this.otpLoginService.checkotp(otpmaster);
		return checkotp;
	}

}
