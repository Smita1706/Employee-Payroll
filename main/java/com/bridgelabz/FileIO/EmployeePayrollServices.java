package com.bridgelabz.FileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollServices {
	 public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
	    private List<EmployeePayrollData> employeePayrollList;

	    public EmployeePayrollServices() {}

	    public EmployeePayrollServices(List<EmployeePayrollData> employeePayrollList) {
	        this.employeePayrollList = employeePayrollList;
	    }

	    public static void main(String[] args) {
	        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
	        EmployeePayrollServices employeePayrollService = new EmployeePayrollServices(employeePayrollList);
	        Scanner consoleInputReader = new Scanner(System.in);
	        employeePayrollService.readEmployeePayrollData(consoleInputReader);
	        employeePayrollService.writeEmployeePayrollData(IOService.CONSOLE_IO);
	    }

	    public void writeEmployeePayrollData(IOService ioService) {
	        if(ioService.equals(IOService.CONSOLE_IO))
	        System.out.println("\n Writing Employee Roaster to console\n " + employeePayrollList);
	        else if (ioService.equals(IOService.FILE_IO))
	            new EmployeePayrollFileIO().writeData(employeePayrollList);
	    }

	    private void readEmployeePayrollData(Scanner consoleInputReader) {
	        System.out.print("Enter Employee ID: ");
	        int id = consoleInputReader.nextInt();
	        System.out.print("Enter Employee name: ");
	        String name = consoleInputReader.next();
	        System.out.println("Enter Employee Salary: ");
	        double salary = consoleInputReader.nextDouble();
	        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	    }
	    public void printData(IOService ioService) {
	        if (ioService.equals(IOService.FILE_IO))
	            new EmployeePayrollFileIO().printData();
	    }
	    public long countEntries(IOService ioService) {
	        if (ioService.equals(IOService.FILE_IO))
	         return  new EmployeePayrollFileIO().countEntries();
	        return 0;
	    }
	    public void readEmployeePayrollData(IOService ioService) {
	        if (ioService.equals(IOService.FILE_IO))
	           new EmployeePayrollFileIO().readData();
	    }
	}