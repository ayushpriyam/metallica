/**
 * 
 */
package com.metallica.refData.services;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.metallica.refData.entity.Login;
import com.metallica.refData.repos.LoginRepository;
import com.metallica.refData.repos.RoleRepository;

/**
 * @author ayupriya
 *
 */
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(Login login) {
		login.setUserPassword(bCryptPasswordEncoder.encode(login.getUserPassword()));
		login.setRoles(new HashSet<>(roleRepository.findAll()));
		userRepository.save(login);

	}

	@Override
	public Login findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
