package com.greatLearning.StudentsManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatLearning.StudentsManagementSystem.Repository.UserRepository;
import com.greatLearning.StudentsManagementSystem.Security.MyUserDetails;
import com.greatLearning.StudentsManagementSystem.entity.User;

public class UserDetailsServiceImpl implements UserDetailsService  {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.getUserByUsername(username);
		System.out.println(user.getUsername());
		if(user==null) {
			throw new UsernameNotFoundException("Could find user");
			
		}
		return new MyUserDetails(user);
	}

}
