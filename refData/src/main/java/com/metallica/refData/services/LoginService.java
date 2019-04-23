/**
 * 
 */
package com.metallica.refData.services;

import com.metallica.refData.entity.Login;

/**
 * @author ayupriya
 *
 */
public interface LoginService {
	
	void save(Login login);

    Login findByUsername(String username);
	
}
