package com.bridgelabz.FileIO;

import static com.bridgelabz.FileIO.EmployeePayrollServices.IOService.FILE_IO;
import java.util.Arrays;

import org.junit.Test;

public class EmployeePayrollServiceTest {
	 @Test
	    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
	        EmployeePayrollData[] arrayofEmp = {
	                new EmployeePayrollData(1,"Jeff", 1000000.0),
	                new EmployeePayrollData(2,"Jeff", 2000000.0),
	                new EmployeePayrollData(3,"Jeff", 3000000.0),
	        };
	        EmployeePayrollServices employeePayrollService;
	        employeePayrollService = new EmployeePayrollServices(Arrays.asList(arrayofEmp));
	        employeePayrollService.writeEmployeePayrollData(FILE_IO);
	        employeePayrollService.printData(FILE_IO);
	    }
	 
	 @Test
	    public void givenFileOnReadingFromFile() {
	        EmployeePayrollServices employeePayrollService = new EmployeePayrollServices();
	        employeePayrollService.readEmployeePayrollData(FILE_IO);
	    }
}
