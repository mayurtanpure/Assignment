package com.Yash.Assignment_2;
class Student
{
	int Rollno;
	int Accountno;
	String Custname;
	String cust_address;
	String cust_dob;
	String cust_account_opening_date;
	String Branch;
	public Student(int rollno, int accountno, String custname, String cust_address, String cust_dob,
			String cust_account_opening_date, String branch) {
		super();
		Rollno = rollno;
		Accountno = accountno;
		Custname = custname;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		Branch = branch;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Accountno=" + Accountno + ", Custname=" + Custname + ", cust_address="
				+ cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date
				+ ", Branch=" + Branch + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
class Branch extends Student
{
	int branch_id;
	String branch_name;
	String branch_address;
	public Branch(int rollno, int accountno, String custname, String cust_address, String cust_dob,
			String cust_account_opening_date, String branch, int branch_id, String branch_name, String branch_address) {
		super(rollno, accountno, custname, cust_address, cust_dob, cust_account_opening_date, branch);
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_address = branch_address;
	}
	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_address=" + branch_address
				+ ", Rollno=" + Rollno + ", Accountno=" + Accountno + ", Custname=" + Custname + ", cust_address="
				+ cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date
				+ ", Branch=" + Branch + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}
class Customer_Account_Statement extends Branch
{
	int Caid;
	int custId;
	Double amount;
	Double Deposit_withdrawal;
	String deposit_date;
	public Customer_Account_Statement(int rollno, int accountno, String custname, String cust_address, String cust_dob,
			String cust_account_opening_date, String branch, int branch_id, String branch_name, String branch_address,
			int caid, int custId, Double amount, Double deposit_withdrawal, String deposit_date) {
		super(rollno, accountno, custname, cust_address, cust_dob, cust_account_opening_date, branch, branch_id,
				branch_name, branch_address);
		Caid = caid;
		this.custId = custId;
		this.amount = amount;
		Deposit_withdrawal = deposit_withdrawal;
		this.deposit_date = deposit_date;
	}
	@Override
	public String toString() {
		return "Customer_Account_Statement [Caid=" + Caid + ", custId=" + custId + ", amount=" + amount
				+ ", Deposit_withdrawal=" + Deposit_withdrawal + ", deposit_date=" + deposit_date + ", branch_id="
				+ branch_id + ", branch_name=" + branch_name + ", branch_address=" + branch_address + ", Rollno="
				+ Rollno + ", Accountno=" + Accountno + ", Custname=" + Custname + ", cust_address=" + cust_address
				+ ", cust_dob=" + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date + ", Branch="
				+ Branch + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
public class Oops_3 {

	public static void main(String[] args) {
		Customer_Account_Statement obj=new Customer_Account_Statement(0, 0, null, null, null, null, null, 0, null, null, 0, 0, null, null, null);
                                   System.out.println();
	}

}
