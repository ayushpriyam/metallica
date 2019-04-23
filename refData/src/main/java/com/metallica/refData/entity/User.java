/**
 * 
 */
package com.metallica.refData.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author ayupriya
 *
 */
@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "U_ID")
	private int userId;
	@Column(name = "U_NAME")
	private String userName;
	@Column(name = "U_CONTACT")
	private long userPhoneNumber;
	@Column(name = "U_EMAIL")
	private String userEmail;
	@Column(name = "U_GENDER")
	private String userGender;
	
	@OneToOne
	private Login login;

	/**
	 * @param userId
	 * @param userName
	 * @param userPhoneNumber
	 * @param userEmail
	 * @param userGender
	 */
	public User(String userName, long userPhoneNumber, String userEmail, String userGender) {
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.userEmail = userEmail;
		this.userGender = userGender;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPhoneNumber
	 */
	public long getUserPhoneNumber() {
		return userPhoneNumber;
	}

	/**
	 * @param userPhoneNumber the userPhoneNumber to set
	 */
	public void setUserPhoneNumber(long userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userGender
	 */
	public String getUserGender() {
		return userGender;
	}

	/**
	 * @param userGender the userGender to set
	 */
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhoneNumber=" + userPhoneNumber
				+ ", userEmail=" + userEmail + ", userGender=" + userGender + "]";
	}

}
