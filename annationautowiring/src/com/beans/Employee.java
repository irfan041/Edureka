package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int eid;
	private String ename;
	private String eemail;
	private Account acc;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public Account getAcc() {
		return acc;
	}

	// @Autowired(required=true)
	// @Qualifier("account2")
	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public void getEmployeeDetails() {
		System.out.println("employee details");
		System.out.println("employee id:" + eid);
		System.out.println("employee name:" + ename);
		System.out.println("employee email:" + eemail);
		System.out.println("Account  details");
		System.out.println("------------------------");
		System.out.println("account num:" + acc.getAccnum());
		System.out.println("account type:" + acc.getAcctype());
		System.out.println("account num:" + acc.getAccbrachname());
	}

}
