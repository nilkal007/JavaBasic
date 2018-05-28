package com.scp.emp.service;

import java.util.ArrayList;
import java.util.List;

import com.scp.emp.bean.Employee;

public class EmpSerImp implements EmpService  {
	List<Employee> listOfEmps = new ArrayList<Employee>();
	
	
	
	@Override
	public boolean addEmp(Employee emp1) {
		return listOfEmps.add(emp1);
		
	}

	@Override
	public List<Employee> remove(int empId) {
		for(int i=0;i<listOfEmps.size();i++){
			Employee e = listOfEmps.get(i);
			if(e.getEmpId()==empId){
				listOfEmps.remove(e);
			}
		}
		
		return null;
	}

	@Override
	public List<Employee> getAllEmp() {
		return listOfEmps;
	}

	@Override
	public boolean updateEmp(Employee employee) {
		for (int i = 0; i < listOfEmps.size(); i++) {
			Employee e =listOfEmps.get(i);
			if (e.getEmpId()==employee.getEmpId()) {
				e.setAdress(employee.getAdress());
				e.setEmpName(employee.getEmpName());
				e.setEmpSal(employee.getEmpSal());
			}
		}
		return false;
	}

	

	
	
}
