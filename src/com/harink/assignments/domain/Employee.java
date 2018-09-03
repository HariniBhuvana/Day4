package com.harink.assignments.domain;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private double employeePhone;
	private double basicSalary;
	
	
	
	public static final double SPECIALALLOWANCE=250.80;
	public static final double HRA=1000.50;
	public Employee() {
		
	}
	public Employee(long Id,String name,String address,double phone) {
		super();
		this.employeeId=Id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		}
	public double calculateSalary() {
		double salary;
		salary=basicSalary+(basicSalary*SPECIALALLOWANCE/100)+(basicSalary*HRA/100);
		return salary;
		
		
	}
	
	

}
