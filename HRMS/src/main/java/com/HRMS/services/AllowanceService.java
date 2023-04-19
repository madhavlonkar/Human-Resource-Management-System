package com.HRMS.services;

import java.util.List;

import com.HRMS.model.AllowanceMaster;

/**
 * This interface defines the methods for managing AllowanceMaster objects.
 */
public interface AllowanceService {

    /**
     * Retrieves a list of all AllowanceMaster objects.
     *
     * @return List of AllowanceMaster objects.
     */
    List<AllowanceMaster> getAllAllowances();

    /**
     * Retrieves an AllowanceMaster object by its ID.
     *
     * @param allowanceId ID of the AllowanceMaster to retrieve.
     * @return AllowanceMaster object if found, null otherwise.
     */
    AllowanceMaster getAllowanceById(int allowanceId);

    /**
     * Adds a new AllowanceMaster object.
     *
     * @param allowance AllowanceMaster object to add.
     * @return The added AllowanceMaster object.
     */
    AllowanceMaster addAllowance(AllowanceMaster allowance);

    /**
     * Updates an existing AllowanceMaster object.
     *
     * @param allowance AllowanceMaster object with updated values.
     * @param allowanceId ID of the AllowanceMaster to update.
     * @return The updated AllowanceMaster object.
     */
    AllowanceMaster updateAllowance(AllowanceMaster allowance, int allowanceId);

    /**
     * Deletes an AllowanceMaster object by its ID.
     *
     * @param allowanceId ID of the AllowanceMaster to delete.
     */
    void deleteAllowance(int allowanceId);

}
