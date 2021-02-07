package com.vcoelho.servicosmobile.service;

import com.vcoelho.servicosmobile.entity.UserSystem;
import com.vcoelho.servicosmobile.security.UserSS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.vcoelho.servicosmobile.repository.UserSystemRepository;

/**
 *
 * @author vinicius
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserSystemRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserSystem userSystem = repo.findByEmail(email);
		if (userSystem == null) {
			throw new UsernameNotFoundException(email);
		}
		return new UserSS(userSystem.getId(), userSystem.getEmail(), userSystem.getSenha());
	}
}
