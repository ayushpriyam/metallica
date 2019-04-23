/**
 * 
 */
package com.metallica.refData.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metallica.refData.entity.Login;

/**
 * @author ayupriya
 *
 */
public interface LoginRepository extends JpaRepository<Login, Integer> {
	
	Login findByUsername(String username);
	
}
