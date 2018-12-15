package com.employee.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Department {
	private int departmentId;
	private String departmentName;
	private String departmentCode;
	private String departmentHeadId;
	private  List<String> departmentCity;
	private  List<String> employees;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentHeadId() {
		return departmentHeadId;
	}
	public void setDepartmentHeadId(String departmentHeadId) {
		this.departmentHeadId = departmentHeadId;
	}
	public List<String> getDepartmentCity() {
		return departmentCity;
	}
	public void setDepartmentCity(List<String> departmentCity) {
		this.departmentCity = departmentCity;
	}
	public List<String> getEmployees() {
		return employees;
	}
	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDOE() {
		return DOE;
	}
	public void setDOE(Date dOE) {
		DOE = dOE;
	}
	private String status;
	private Date DOE;
	
	

}
