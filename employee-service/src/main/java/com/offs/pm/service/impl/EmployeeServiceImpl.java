package com.offs.pm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offs.pm.dto.EmployeeResponse;
import com.offs.pm.dto.EntityToDtoMapper;
import com.offs.pm.entity.Employee;
import com.offs.pm.exception.EmployeeNotFoundException;
import com.offs.pm.repo.EmployeeRepo;
import com.offs.pm.service.EmployeeService;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo employeeRepo;

	private EntityToDtoMapper mapperObject;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepo employeeRepo, EntityToDtoMapper mapperObject) {

		this.employeeRepo = employeeRepo;
		this.mapperObject = mapperObject;
	}

	@Override
	public EmployeeResponse getEmployeeById(Integer empid) {

		Optional<Employee> employee = employeeRepo.findByEmpId(empid);
		EmployeeResponse empResponse = null;

		if (employee.isPresent()) {
			empResponse = mapperObject.getEmployeeResponse(employee.get());
		} else {
			throw new EmployeeNotFoundException("Employee Id" + empid + "Doesn't Exist");
		}

		return empResponse;
	}

	@Override
	public List<EmployeeResponse> getEmployeeByName(String empName) {

		List<Employee> empList = employeeRepo.findByEmployeeName(empName);

		List<EmployeeResponse> employeeResponseList = mapperObject.getEmployeeResponseList(empList);

		return employeeResponseList;

	}

	@Override
	public List<EmployeeResponse> getEmployeeByJob(String empByJobName) {

		List<Employee> empList = employeeRepo.findEmployeeByJob(empByJobName);

		System.out.println("Emp List size is " + empList.size());

		List<EmployeeResponse> employeeResponseList = mapperObject.getEmployeeResponseList(empList);

		return employeeResponseList;

	}

}
