package com.offs.pm.dto;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.offs.pm.entity.Employee;

@Component
public class EntityToDtoMapper {

	public EmployeeResponse getEmployeeResponse(Employee employee) {

		EmployeeResponse employeeResponse = new EmployeeResponse.EmployeeResponseBuilder(employee.getEmpId(),
				employee.geteName()).withSalary(employee.getSalary()).withJob(employee.getJob())
						.withManager(employee.getManager()).withHireDate(employee.getHireDate())
						.withDeptNo(employee.getDeptNo()).build();

		return employeeResponse;

	}

	public List<EmployeeResponse> getEmployeeResponseList(List<Employee> empList) {

		List<EmployeeResponse> empResponseList = empList.stream().map(employee -> getEmployeeResponse(employee))
				.collect(Collectors.toList());

		return empResponseList;

	}

}
