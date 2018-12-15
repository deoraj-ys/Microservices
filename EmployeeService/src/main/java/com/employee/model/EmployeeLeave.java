package com.employee.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="leaves")
public class EmployeeLeave {
	private String leaveCode;
	private String leaveType;
	private Date startDate;
	private Date endDate;
	private int duration;
	private Date appliedDate;
	private int nolApplied;
	private int nolRemaining;
	private int totalLeave;
	private String Description;
	private boolean staus;
	private Employee approvedBy;
	private String approverComment;
	private boolean isPaid;

    public Date getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}
	public int getNolApplied() {
		return nolApplied;
	}
	public void setNolApplied(int nolApplied) {
		this.nolApplied = nolApplied;
	}
	public int getNolRemaining() {
		return nolRemaining;
	}
	public void setNolRemaining(int nolRemaining) {
		this.nolRemaining = nolRemaining;
	}
	public int getTotalLeave() {
		return totalLeave;
	}
	public void setTotalLeave(int totalLeave) {
		this.totalLeave = totalLeave;
	}
	public String getLeaveCode() {
		return leaveCode;
	}
	public void setLeaveCode(String leaveCode) {
		this.leaveCode = leaveCode;
	}
	public Date getStartDate() {
		return startDate;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public boolean isStaus() {
		return staus;
	}
	public void setStaus(boolean staus) {
		this.staus = staus;
	}
	public Employee getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(Employee approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getApproverComment() {
		return approverComment;
	}
	public void setApproverComment(String approverComment) {
		this.approverComment = approverComment;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	
}
