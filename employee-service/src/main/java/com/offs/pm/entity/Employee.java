package com.offs.pm.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP")
public class Employee {

	@Id
	@Column(name = "EMPNO")
	private Integer empId;

	@Column(name = "ENAME")
	private String eName;

	@Column(name = "JOB")
	private String job;

	@Column(name = "MGR")
	private Integer manager;

	@Column(name = "HIREDATE")
	private Date hireDate;

	@Column(name = "SAL")
	private BigDecimal salary;

	@Column(name = "COMM")
	private Integer comm;

	@Column(name = "DEPTNO")
	private Integer deptNo;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getManager() {
		return manager;
	}

	public void setManager(Integer manager) {
		this.manager = manager;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Integer getComm() {
		return comm;
	}

	public void setComm(Integer comm) {
		this.comm = comm;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Employee() {
	}

	public Employee(Integer empId, String eName, String job, Integer manager, Date hireDate, BigDecimal salary,
			Integer comm, Integer deptNo) {
		this.empId = empId;
		this.eName = eName;
		this.job = job;
		this.manager = manager;
		this.hireDate = hireDate;
		this.salary = salary;
		this.comm = comm;
		this.deptNo = deptNo;
	}

}
