package com.student.entities;

public class StudentUser {
	int stuId;
	String stuName;
	String stuAddress;
	String stuEmail;
	Long stuPhone;
	public StudentUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getStuEmail() {
		return stuEmail;
	}
	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}
	public Long getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(Long stuPhone) {
		this.stuPhone = stuPhone;
	}
	public StudentUser(int stuId, String stuName, String stuAddress, String stuEmail, Long stuPhone) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
		this.stuEmail = stuEmail;
		this.stuPhone = stuPhone;
	}

}
