package cecchin.classObjects;

import java.util.ArrayList;

public class School {
	// Create a simple School class. Attributes stored should include the school
	// name, address, phone number (String), principal, and separate
	// ArrayList<String> for teachers (each entry will include the name only).
	// Encapsulate the data with appropriate getters and setters. Additional
	// public methods should include addTeacher(String teacher),
	// removeTeacher(String teacher), and toString() In the Main() program, create a
	// School. Set its attributes, including adding 3 teachers to the staff; print
	// the school’s details.

	private String school;
	private String address;
	private String phoneNum;
	private String principal;
	ArrayList<String> staff;

	// setters
	public void setSchool(String school) {
		this.school = school;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public void setStaff(ArrayList<String> staff) {
		this.staff = staff;
	}

	public void addTeacher(String teacher) {
		staff.add(teacher);
	}

	public void removeTeacher(String teacher) {
		staff.remove(staff.indexOf(teacher));
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(school).append(staff).append(principal).append(phoneNum);
		return sb.toString();
	}

	// getters

	public String getSchool() {
		return school;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getPrincipal() {
		return principal;
	}

	public ArrayList<String> getStaff() {
		return staff;
	}

}
