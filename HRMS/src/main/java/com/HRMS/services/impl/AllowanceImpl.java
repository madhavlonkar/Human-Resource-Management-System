//package com.HRMS.services.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.HRMS.dao.AllowanceDAO;
//import com.HRMS.model.AllowanceMaster;
//import com.HRMS.services.AllowanceService;
//
//@Component
//public class AllowanceImpl implements AllowanceService {
//
//    // Define a logger object for logging messages
//    // private static final Logger LOGGER = LoggerFactory.getLogger(AllowanceImpl.class);
//
//    // Autowire the AllowanceDAO bean
//    @Autowired
//    private AllowanceDAO allowanceDao;
//
//    // Get a list of all allowances
//    public List<AllowanceMaster> getAllAllowances() {
//        List<AllowanceMaster> findAll = null;
//        try {
//            findAll = (List<AllowanceMaster>) allowanceDao.findAll();
//            return findAll;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return findAll;
//        }
//    }
//
//    // Get an allowance by its ID
//    public AllowanceMaster getAllowanceById(int allowanceId) {
//        AllowanceMaster findById = null;
//        try {
//            findById = allowanceDao.findById(allowanceId);
//            return findById;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return findById;
//        }
//    }
//
//    // Add a new allowance
//    public AllowanceMaster addAllowance(AllowanceMaster allowance) {
//        AllowanceMaster allowanceSaved = null;
//        try {
//            allowanceSaved = allowanceDao.save(allowance);
//            return allowanceSaved;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return allowanceSaved;
//        }
//    }
//
//    // Update an existing allowance
//    @Override
//    public AllowanceMaster updateAllowance(AllowanceMaster allowance, int allowanceId) {
//        AllowanceMaster updatedAllowance = null;
//        try {
//            allowance.setAllowance_id(allowanceId);
//            updatedAllowance = allowanceDao.save(allowance);
//            return updatedAllowance;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return updatedAllowance;
//        }
//    }
//
//    // Delete an allowance by its ID
//    @Override
//    public void deleteAllowance(int allowanceId) {
//        try {
//            allowanceDao.deleteById(allowanceId);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}


package com.HRMS.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.HRMS.dao.AllowanceDAO;
import com.HRMS.model.AllowanceMaster;
import com.HRMS.services.AllowanceService;

@Component
public class AllowanceImpl implements AllowanceService {

	private static final Logger logger = LoggerFactory.getLogger(AllowanceImpl.class);

	
	@Autowired
	private AllowanceDAO allowancedao;

	@Override
	public List<AllowanceMaster> getAllAllowances() {
		try {
			return (List<AllowanceMaster>) allowancedao.findAll();
		} catch (Exception e) {
			logger.error("Error getting all allowances: {}", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to get all allowances", e);
			
		}
	}

	@Override
	public AllowanceMaster getAllowanceById(int allowanceid) {
		try {
			AllowanceMaster allowance = allowancedao.findById(allowanceid);
	        if (allowance != null) {
	            return allowance;
	        }
		} catch (IllegalArgumentException e) {
			logger.error("Invalid allowance ID: {}", allowanceid);
			throw new RuntimeException("Invalid allowance ID", e);
		} catch (Exception e) {
			logger.error("Error getting allowance with ID {}: {}", allowanceid, e.getMessage());
			throw new RuntimeException("Failed to get allowance by ID", e);
		}
		return null;
	}

	@Override
	public AllowanceMaster addAllowance(AllowanceMaster allowance) {
		try {
			return allowancedao.save(allowance);
		} catch (Exception e) {
			logger.error("Error saving allowance: {}", e.getMessage());
			throw new RuntimeException("Failed to save allowance", e);
		}
	}

	
	@Override
	public AllowanceMaster updateAllowance(AllowanceMaster allowance, int allowanceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllowance(int allowanceId) {
		// TODO Auto-generated method stub
		
	}
}

