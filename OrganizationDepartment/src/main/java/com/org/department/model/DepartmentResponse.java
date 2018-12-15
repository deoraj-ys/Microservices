package com.org.department.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DepartmentResponse {
	public DepartmentResponse(String id, String response) {
		super();
		this.id = id;
		this.response = response;
	}
	private String id;
	private String response;
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getResponse() {
		return response;
	}
	public DepartmentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setResponse(String response) {
		this.response = response;
	}
	/*public DepartmentResponse(Long id, String response) {
		super();
		this.id = id;
		this.response = response;
	}
*/
}
