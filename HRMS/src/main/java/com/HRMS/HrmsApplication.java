 package com.HRMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.HRMS.utility.DatabaseCleanupTask;

@SpringBootApplication
public class HrmsApplication {
	
	public static void main(String[] args) {
		DatabaseCleanupTask.DatabaseCleanup();
		SpringApplication.run(HrmsApplication.class, args);
		
	}

}
