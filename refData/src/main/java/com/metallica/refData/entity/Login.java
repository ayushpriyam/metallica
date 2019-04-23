/**
 * 
 */
package com.metallica.refData.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ayupriya
 *
 */
@Entity
public class Login implements Serializable {
	@Id
	@Column(name = "U_ID")
	private int userId;
	@Column(name = "U_USERNAME")
	private String username;
	@Column(name = "U_PASSWORD")
	private String userPassword;

	/**
	 * @param userId
	 * @param username
	 * @param userPassword
	 */
	public Login(int userId, String username, String userPassword) {
		this.userId = userId;
		this.username = username;
		this.userPassword = userPassword;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

}
