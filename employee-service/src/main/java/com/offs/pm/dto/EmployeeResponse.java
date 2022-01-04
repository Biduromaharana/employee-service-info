package com.offs.pm.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(value = Include.NON_NULL)
@JsonPropertyOrder("{emp_no, emp_name,emp_job,emp_manager,emp_hireDate,emp_salary,emp_commision,emp_deptNo}")
public class EmployeeResponse {

	@JsonProperty("emp_no")
	private Integer empId;

	@JsonProperty("emp_name")
	private String firstName;

	private String lastName;

	@JsonProperty("emp_job")
	private String job;

	@JsonProperty("emp_manager")
	private Integer Manager;

	@JsonProperty("emp_hireDate")
	@JsonFormat(pattern = "dd-MM-yyy")
	private Date hireDate;

	@JsonProperty("emp_salary")
	private BigDecimal salary;

	@JsonProperty("emp_commision")
	private Integer commision;

	@JsonProperty("emp_deptNo")
	private Integer deptNo;

	private EmployeeResponse(EmployeeResponseBuilder empResponseBuilder) {
		this.empId = empResponseBuilder.empId;
		this.firstName = empResponseBuilder.firstName;
		this.lastName = empResponseBuilder.lastName;
		this.job = empResponseBuilder.job;
		this.Manager = empResponseBuilder.manager;
		this.hireDate = empResponseBuilder.hireDate;
		this.salary = empResponseBuilder.salary;
		this.commision = empResponseBuilder.commision;
		this.deptNo = empResponseBuilder.deptNo;
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public Integer getCommision() {
		return commision;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public String getJob() {
		return job;
	}

	@JsonProperty("emp_manager")
	public Integer getManager() {
		return Manager;
	}

	public static class EmployeeResponseBuilder

	{
		@JsonIgnoreProperties("{empId,firstName ,lastName,job,manager,hireDate,salary,commision,deptNo}")
		private Integer empId;
		private String firstName;
		private String lastName;
		private String job;
		private Integer manager;
		private Date hireDate;
		private BigDecimal salary;
		private Integer commision;
		private Integer deptNo;

		public EmployeeResponseBuilder(Integer empId, String firstName) {
			this.firstName = firstName;
			this.empId = empId;
		}

		public EmployeeResponseBuilder withSalary(BigDecimal salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeResponseBuilder withDeptNo(Integer deptNo) {
			this.deptNo = deptNo;
			return this;
		}

		public EmployeeResponseBuilder withCommision(Integer commision) {
			this.commision = commision;
			return this;
		}

		public EmployeeResponseBuilder withJob(String job) {
			this.job = job;
			return this;
		}

		public EmployeeResponseBuilder withManager(Integer manager) {
			this.manager = manager;
			return this;
		}

		public EmployeeResponseBuilder withHireDate(Date hireDate) {
			this.hireDate = hireDate;
			return this;
		}

		public void setEmpId(Integer empId) {
			this.empId = empId;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setCommision(Integer commision) {
			this.commision = commision;
		}

		public void setDeptNo(Integer deptNo) {
			this.deptNo = deptNo;
		}

		public EmployeeResponse build() {
			return new EmployeeResponse(this);

		}

	}

}
