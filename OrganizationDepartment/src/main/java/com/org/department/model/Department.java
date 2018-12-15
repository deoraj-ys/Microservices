package com.org.department.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Department {
	@Id
	@GeneratedValue
	private Long departmentId;
	private String departmentName;
	private String departmentCode;
	private String departmentHeadId;
	private String departmentCity;
	private String employeeId;
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
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
	public String getDepartmentCity() {
		return departmentCity;
	}
	public void setDepartmentCity(String departmentCity) {
		this.departmentCity = departmentCity;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
