package com.greatLearning.StudentsManagementSystem.Repository;

import com.greatLearning.StudentsManagementSystem.entity.User;

public interface UserRepository {
	
	public User getUserByUsername(String name);

}
