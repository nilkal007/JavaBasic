package com.scp.emp.main;
import com.scp.emp.bean.*;
import com.scp.emp.service.*;




public class TextCustSer {

	public static void main(String[] args) {
	
		Address ads =new Address(1234,"pune");
		Address ads1 =new Address(1234,"mumbai");		 
		Employee emp = new Employee(1,"nilesh",50000,ads);
		Employee emp1 = new Employee(1,"prasad",50000,ads1);
 		EmpService service =new EmpSerImp();
		
		
		service.addEmp(emp);
		
	
	
	System.out.println(service.getAllEmp());
	service.updateEmp(emp1);
	System.out.println(service.getAllEmp());
	
}
}