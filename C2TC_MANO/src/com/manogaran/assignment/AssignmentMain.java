package com.manogaran.assignment;
import com.manogaran.assignment.employee.*;
import com.manogaran.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
		 manager manager = new manager("John", 101, 90000, "Sales");
		 developer developer = new developer("Alice", 102, 80000, "Java");
		 EmployeeUtilities.printEmployeeDetails(manager);
		 EmployeeUtilities.printEmployeeDetails(developer);
		 }
}
