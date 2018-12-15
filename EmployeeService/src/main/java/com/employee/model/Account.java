package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Account {
	  
	  @Id
	  @GeneratedValue
	  private String id;
	  @Column
	  private String username;
	  @Column
	  private String password;
	  
	  public Account(){}
	  
	  public Account(String username, String password) {
	    this.username = username;
	    this.password = password;
	  }
	  public String getId() {
	    return id;
	  }
	  public void setId(String id) {
	    this.id = id;
	  }
	  public String getUsername() {
	    return username;
	  }
	  public void setUsername(String username) {
	    this.username = username;
	  }
	  public String getPassword() {
	    return password;
	  }
	  public void setPassword(String password) {
	    this.password = password;
	  }

	}