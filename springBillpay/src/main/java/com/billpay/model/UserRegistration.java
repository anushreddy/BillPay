package com.billpay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "useraccount")
@NamedQueries({ @NamedQuery(name = "authenticate", query = "SELECT user FROM UserRegistration user "
		+ "WHERE user.email = :email AND user.password = :pass") })
public class UserRegistration {

	@Column(name = "username")
	private String username;

	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "pwd")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegistration [username=" + username + ", email=" + email + ", password=" + password + "]";
	}

}
