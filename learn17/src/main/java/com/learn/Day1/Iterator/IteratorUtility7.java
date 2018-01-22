package com.learn.Day1.Iterator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.learn.pojo.Address;
import com.learn.pojo.Employee;

public class IteratorUtility7 {
	
	public static void main(String args[]) {
	
		List<Employee> employeeList = new LinkedList<>();
		
		Address address1 = new Address("1", "TVNagar", "Adyar", "Chennai", "TamilNadu", 6000028);
		Address address2 = new Address("2", "TVNagar", "Adyar", "Chennai", "TamilNadu", 6000028);
		Address address3 = new Address("3", "TVNagar", "Adyar", "Chennai", "TamilNadu", 6000028);
		Employee employee1 = new Employee(1, "emp1", 23, address1, 12346);
		Employee employee2 = new Employee(2, "emp2", 24, address1, 12347);
		Employee employee3 = new Employee(3, "emp2", 24, address2, 12344);
		Employee employee4 = new Employee(4, "emp2", 24, address3, 12345);
	
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee1);
		employeeList.add(employee2);
	
		for(Employee employee: employeeList) {
			System.out.println(employee.getEmployeeId());
		}
		Collections.sort(employeeList);
		
		int uniqueAddressCount = 0;
		
		for(Employee employee: employeeList) {
			System.out.println(employee.getEmployeeId());
			if(employee.getAddress().getDoorNumber().equals("1")) {
				uniqueAddressCount++;
			}
		}
		
		System.out.println("unique Address Count -> "+uniqueAddressCount);
		
		
		
	}

}
