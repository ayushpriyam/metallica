/**
 * 
 */
package com.metallica.refData.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.metallica.refData.entity.Login;
import com.metallica.refData.services.LoginService;

/**
 * @author ayupriya
 *
 */
public class UserValidator implements Validator {
	
	@Autowired
    private LoginService loginService;

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Login.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
	}

}
