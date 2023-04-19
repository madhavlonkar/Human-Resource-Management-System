package com.HRMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LoginMaster")
public class LoginMaster {

	@Id
	@Column(name="userid")
	private int userid;
	
	@Column(name="User")
	private String user;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Role")
	private String role;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LoginMaster(int userid, String user, String username, String password, String role) {
		super();
		this.userid = userid;
		this.user = user;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public LoginMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginMaster [userid=" + userid + ", user=" + user + ", username=" + username + ", password=" + password
				+ ", role=" + role + "]";
	}
	
	

}
