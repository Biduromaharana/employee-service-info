package com.offs.pm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.offs.pm.dto.EmployeeRequest;
import com.offs.pm.dto.EmployeeResponse;
import com.offs.pm.exception.EmployeeNotFoundException;
import com.offs.pm.service.EmployeeService;

@RequestMapping("/v1")
@RestController("empController")
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@PostMapping("/employees")
	public ResponseEntity<?> createEmployee(@RequestBody EmployeeRequest employeeRequest) {

		EmployeeResponse employeeResp = null;

		ResponseEntity<EmployeeResponse> employeeResponse = new ResponseEntity<EmployeeResponse>(employeeResp,
				HttpStatus.CREATED);

		return employeeResponse;
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<?> getEmployee(@PathVariable("id") Integer empId) {

		EmployeeResponse employeeResp = null;
		// try {
		employeeResp = employeeService.getEmployeeById(empId);
		ResponseEntity<EmployeeResponse> employeeResponse = new ResponseEntity<EmployeeResponse>(employeeResp,
				HttpStatus.OK);
		return employeeResponse;
//		} catch (EmployeeNotFoundException employeeNotFoundException) {
//			ResponseEntity<String> employeeResponse = new ResponseEntity<String>(HttpStatus.NO_CONTENT);
//			return employeeResponse;
//
//		}
	}

	@GetMapping("/employees/name/{name}")
	public ResponseEntity<?> getEmployeeByExactName(@PathVariable("name") String name) {

		List<EmployeeResponse> employeeResp = null;

		employeeResp = employeeService.getEmployeeByName(name);

		ResponseEntity<List<EmployeeResponse>> employeeResponse = new ResponseEntity<List<EmployeeResponse>>(
				employeeResp, HttpStatus.OK);

		return employeeResponse;
	}

	@PatchMapping("/employees/{id}")
	public ResponseEntity<?> updateEmployee(@PathVariable("id") Integer id,
			@RequestBody EmployeeRequest employeeRequest) {

		EmployeeResponse employeeResp = null;
		ResponseEntity<EmployeeResponse> employeeResponse = new ResponseEntity<EmployeeResponse>(employeeResp,
				HttpStatus.OK);

		return employeeResponse;
	}

	@GetMapping("/employees/job/{empJob}")
	public ResponseEntity<?> getEmployeeByJobName(@PathVariable("empJob") String empJob) {

		List<EmployeeResponse> employeeResp = null;

		employeeResp = employeeService.getEmployeeByJob(empJob);

		ResponseEntity<List<EmployeeResponse>> employeeResponse = new ResponseEntity<List<EmployeeResponse>>(
				employeeResp, HttpStatus.OK);

		return employeeResponse;
	}
}
