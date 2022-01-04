package com.offs.pm.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.offs.pm.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	public Optional<Employee> findByEmpId(Integer empId);

	@Query("select e from  Employee e where e.eName like CONCAT('%',':eName','%')")
	public List<Employee> findByEmployeeName(@Param("eName") String eName);
	
	
	@Query("select e from  Employee e where e.job=:job")
	public List<Employee> findEmployeeByJob(@Param("job") String job);


}
