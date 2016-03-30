package EmployeeDetails;
// This program has been written to demonstrate the encapsulation.
public class EmployeeDetails {

	private int EmpCode;					//Declaration of private variables.
	private String EmpName;
	private String EmpPosition;
	private double Salary;
	private int YearsOfExperience;
	
	public int getEmpCode() {				// Getters.
		return EmpCode;
	}
	public void setEmpCode(int empCode) {		// Setters.
		EmpCode = empCode;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpPosition() {
		return EmpPosition;
	}
	public void setEmpPosition(String empPosition) {
		EmpPosition = empPosition;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public int getYearsOfExperience() {
		return YearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		YearsOfExperience = yearsOfExperience;
	}
	
	
	public static void main(String[] args) {
		
		EmployeeDetails ObjEmployeeDetails = new EmployeeDetails();			//Creating object for employee details.
		ObjEmployeeDetails.setEmpCode (001);								// assigining values through the setters.
		ObjEmployeeDetails.setEmpName("R Santosh");
		ObjEmployeeDetails.setEmpPosition("Project Manager");
		ObjEmployeeDetails.setSalary(2000000);
		ObjEmployeeDetails.setYearsOfExperience(12);
				
																			// Printing all getters.
		System.out.println("Employee code of the employee is : " + ObjEmployeeDetails.getEmpCode());
		System.out.println("Employee name is                 : " + ObjEmployeeDetails.getEmpName());
		System.out.println("Position of the employee is      : " + ObjEmployeeDetails.getEmpPosition());
		System.out.println("Employee code of the employee is : " + ObjEmployeeDetails.getSalary());
		System.out.println("Employee has an expierence for	 : " + ObjEmployeeDetails.getYearsOfExperience());
	
	}	
}
