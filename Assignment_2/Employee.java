package com.Yash.Assignment_2;

import java.time.LocalDate;
import java.util.Date;

/*
 WAP to print the object of Employee class with the help of toString method. 
Employee class fields :- empid, empname, empsalary, empaddress, emp_dob, 
emp_doj. use Date class to store the date of birth(dob) and date of joining(doj). 
 */
public class Employee {
	 int empid;
    String empname;
    Double empsalary;
    String empaddress;
    LocalDate emp_dob;
    LocalDate emp_doj;
	public Employee(int empid, String empname, double empsalary, String empaddress,LocalDate emp_dob,LocalDate emp_doj) {
		this.empid = empid;
        this.empname = empname;
        this.empsalary = empsalary;
        this.empaddress = empaddress;
        this.emp_dob=emp_dob;
        this.emp_doj=emp_doj;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}
	public static void main(String[] args) {
		Employee e=new Employee(1,"sunil kumar",23000.00,"Pune",LocalDate.of(2022, 02, 17),LocalDate.of(2012, 12, 01));
        System.out.println(e);
	}

}
