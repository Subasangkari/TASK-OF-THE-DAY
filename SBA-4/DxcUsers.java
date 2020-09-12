package com.mysba.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DxcUsers {
	
	@Id
	private int userId ;
	private String userName;
	private String password;
	private String security_question;
	private String security_answer;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurity_question() {
		return security_question;
	}
	public void setSecurity_question(String security_question) {
		this.security_question = security_question;
	}
	public String getSecurity_answer() {
		return security_answer;
	}
	public void setSecurity_answer(String security_answer) {
		this.security_answer = security_answer;
	}
	
	public DxcUsers(int userId, String userName, String password, String security_question, String security_answer) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.security_question = security_question;
		this.security_answer = security_answer;
	}
	
	public DxcUsers() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "DxcUsers [userId=" + userId + ", userName=" + userName + ", password=" + password
				+ ", security_question=" + security_question + ", security_answer=" + security_answer + "]";
	}
	
}
