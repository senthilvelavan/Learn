package com.learn.Day1.Java8;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.learn.Day1.Java8.pojo.Address;
import com.learn.Day1.Java8.pojo.Employee;

public class IteratorUtility {

	public static void main(String args[]) throws Exception {

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
		

		employeeList.forEach(employee -> System.out.println(employee.getEmployeeId()));

		long count = employeeList.stream().filter(employee -> employee.getAddress().getDoorNumber().equals("1")).count();
		
		System.out.println("print random stream");
		employeeList.stream().forEach(employee -> System.out.println(employee.getEmployeeId()));
		System.out.println("print parallel stream");
		employeeList.parallelStream().forEach(employee -> System.out.println(employee.getEmployeeId()));
		
		long distinctCount = employeeList.stream().distinct().count();
		System.out.println("print after sorting");
		employeeList.stream().sorted().forEach(employee -> System.out.println(employee.getEmployeeId()));
		List<Integer> collect = employeeList.stream().map(employee -> employee.getSalary()*100).collect(Collectors.toList());
		
		System.out.println("count of employees with address as door number as 1 -> "+count);
		System.out.println("count of employees with unique employee equals option -> "+distinctCount);
		System.out.println("total salary after incrementing salary by 100 times -> "+collect);

	}

}
