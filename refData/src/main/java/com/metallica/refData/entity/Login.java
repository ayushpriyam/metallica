/**
 * 
 */
package com.metallica.refData.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

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
	
	
	@Transient
    private String passwordConfirm;
	
	 @ManyToMany
	 private Set<Role> roles;
	
	@OneToOne(mappedBy="login", cascade=CascadeType.ALL)
	private User user;

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

	/**
	 * @return the passwordConfirm
	 */
	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	/**
	 * @param passwordConfirm the passwordConfirm to set
	 */
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	/**
	 * @return the roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	

}
