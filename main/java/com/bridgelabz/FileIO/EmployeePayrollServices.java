package com.bridgelabz.FileIO;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollServices {
	ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
	
	public static void main(String[] args) {
		EmployeePayrollServices services = new EmployeePayrollServices();
		Scanner s = new Scanner(System.in);
		services.readEmployeePayrollData(s);
		services.writeEmployeePayrollData();
	}

	private void writeEmployeePayrollData() {
		System.out.println("Writing to the console : "+employeePayrollList);
	}

	private void readEmployeePayrollData(Scanner s) {
		System.out.println("Enter the ID : ");
		int id = s.nextInt();
		System.out.println("Enter the Name : ");
		String name = s.next();
		System.out.println("Enter the salary : ");
		double salary = s.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id,name,salary));

	}


}
