package com.scp.emp.service;
import java.util.*;

import com.scp.emp.bean.Employee;
public interface EmpService {
	boolean addEmp(Employee emp );
	List<Employee> remove(int empId);
	List<Employee> getAllEmp();
	boolean updateEmp(Employee employee);
	
	
	
	

}
