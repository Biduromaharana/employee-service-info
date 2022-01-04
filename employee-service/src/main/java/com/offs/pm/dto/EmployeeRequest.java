package com.offs.pm.dto;

import java.math.BigDecimal;

public class EmployeeRequest {

	private String firstName;

	private String lastName;

	private Integer age;

	private BigDecimal salary;

	private Integer deptNo;

	private Integer commision;

	public EmployeeRequest() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Integer getCommision() {
		return commision;
	}

	public void setCommision(Integer commision) {
		this.commision = commision;
	}

	@Override
	public String toString() {
		return "(firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
				+ ", deptNo=" + deptNo + ", commision=" + commision + ")";
	}

}
