package com.scp.emp.bean;

public class Employee {

	private int empId;
	private String empName;
	private int empSal;
	private Address adress;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", adress=" + adress + "]";
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public Employee(int empId, String empName, int empSal, Address adress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.adress = adress;
	}
	
	
}
