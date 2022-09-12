package com.java;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "StudentData1")
public class Student {

	@Id
	@GeneratedValue
	private int student_id;
	@Column
	private String student_name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private StudentAddress student_address;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public StudentAddress getStudent_address() {
		return student_address;
	}

	public void setStudent_address(StudentAddress student_address) {
		this.student_address = student_address;
	}
}
