package com.employee.model;

import java.util.Date;
 enum Status{
	COMPLETED,PENDING,INPROGRESS,NOTSTARTED
}
 enum TrainingType
 {
	 MANDATORY,OPTIONAL
 }
public class EmployeeTraining {
	private String trainingCode;
	private String trainingName;
	private TrainingType trainingType;
	private Date assignedDate;
	private Date dueDate;
	private Status status;
	private Employee employee;
	public String getTrainingCode() {
		return trainingCode;
	}
	public void setTrainingCode(String trainingCode) {
		this.trainingCode = trainingCode;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public TrainingType getTrainingType() {
		return trainingType;
	}
	public void setTrainingType(TrainingType trainingType) {
		this.trainingType = trainingType;
	}
	public Date getAssignedDate() {
		return assignedDate;
	}
	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
