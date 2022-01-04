package com.offs.pm.service;

import java.util.List;

import com.offs.pm.dto.EmployeeResponse;

public interface EmployeeService {

	public EmployeeResponse getEmployeeById(Integer empid);

	public List<EmployeeResponse> getEmployeeByName(String empName);
	
	public List<EmployeeResponse> getEmployeeByJob(String job);
}
