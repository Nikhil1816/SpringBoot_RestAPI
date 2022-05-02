package com.demo.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection="todos")
public class TodoDTO {

	private String CenterName;
	private String CenterCode;
	private Address address;
	private int StudentCapacity;
	private ArrayList<String> CoursesOffered=new ArrayList<>();
	private Date CreatedOn;
	private String ContactEmail;
	private  String ContactPhone;
	public String getCenterName() {
		return CenterName;
	}
	public void setCenterName(String centerName) {
		CenterName = centerName;
	}
	public String getCenterCode() {
		return CenterCode;
	}
	public void setCenterCode(String centerCode) {
		CenterCode = centerCode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getStudentCapacity() {
		return StudentCapacity;
	}
	public void setStudentCapacity(int studentCapacity) {
		StudentCapacity = studentCapacity;
	}
	public ArrayList<String> getCoursesOffered() {
		return CoursesOffered;
	}
	public void setCoursesOffered(ArrayList<String> coursesOffered) {
		CoursesOffered = coursesOffered;
	}
	public Date getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}
	public String getContactEmail() {
		return ContactEmail;
	}
	public void setContactEmail(String contactEmail) {
		ContactEmail = contactEmail;
	}
	public String getContactPhone() {
		return ContactPhone;
	}
	public void setContactPhone(String contactPhone) {
		ContactPhone = contactPhone;
	}
	
	
}
