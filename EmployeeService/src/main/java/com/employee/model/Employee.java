package com.employee.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonFormat;


@XmlRootElement(name="employees")
@Entity
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long emp_id;
	private String emp_name;
	//private int emp_sal;
	private long emp_phone;
	private String emp_desg;
	private String emp_dep_code;
	private String emp_status;
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date DOB;
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date DOJ;
	private Date createdDate;
	private Date modifiedDate;
	private String mgr_id;
	private String skills;
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@OneToOne(cascade =  CascadeType.ALL)           
	private Address address;
	
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	/*public int getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(int emp_sal) {
		this.emp_sal = emp_sal;
	}*/
	public long getEmp_phone() {
		return emp_phone;
	}
	public void setEmp_phone(long emp_phone) {
		this.emp_phone = emp_phone;
	}
	public String getEmp_desg() {
		return emp_desg;
	}
	public void setEmp_desg(String emp_desg) {
		this.emp_desg = emp_desg;
	}
	public String getEmp_dep_code() {
		return emp_dep_code;
	}
	public void setEmp_dep_code(String emp_dep_code) {
		this.emp_dep_code = emp_dep_code;
	}
	public String getEmp_status() {
		return emp_status;
	}
	public void setEmp_status(String emp_status) {
		this.emp_status = emp_status;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMgr_id() {
		return mgr_id;
	}
	public void setMgr_id(String mgr_id) {
		this.mgr_id = mgr_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
