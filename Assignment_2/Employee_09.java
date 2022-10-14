package com.Yash.Assignment_2;

public class Employee_09 {
	public int empId;
	public String empName;
	public int empSalary;
	public String deptname;

	public Employee_09(int empId, String empName, int empSalary, String deptname) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptname = deptname;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			Employee_09 e1 = new Employee_09(11, "Sunil", 35000, "Hr");

			Employee_09 e2 = (Employee_09) e1.clone();

			System.out.println("Employee Name: "+e1.empName);
			System.out.println("Employee Name After clone: "+e2.empName);
			String empName = "Sunil";
			boolean output1 = empName instanceof String;
			System.out.println("empName: " +empName+ " is instance of Employee: " + output1);
			boolean output2 = e1 instanceof Employee_09;
			System.out.println("e1 is instance of Employee: " + output2);

		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
	}

}
