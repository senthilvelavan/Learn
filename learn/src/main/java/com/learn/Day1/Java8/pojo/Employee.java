package com.learn.Day1.Java8.pojo;

public class Employee {
	
	int employeeId;
	String name;
	int age;
	Address address;
	int salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int employeeId, String name, int age, Address address, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
	}

	
	
}
