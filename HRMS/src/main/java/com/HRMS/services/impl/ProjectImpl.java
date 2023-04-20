package com.HRMS.services.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.controller.ProjectController;
import com.HRMS.dao.ProjectDAO;
import com.HRMS.model.ProjectMaster;
import com.HRMS.services.ProjectService;

@Service
public class ProjectImpl implements ProjectService {
	
	static Logger logger = LogManager.getLogger(ProjectController.class);
	
    @Autowired
    private ProjectDAO projectDAO;
	
	@Override
	public List<ProjectMaster> getAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectMaster getProjectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectMaster addProject(ProjectMaster project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectMaster updateProject(ProjectMaster project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProject(int id) {
		// TODO Auto-generated method stub
		
	}

}
