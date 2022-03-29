package com.greatLearning.StudentsManagementSystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_id")
	private Long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(
			name= "user_roles",
			joinColumns = @JoinColumn(name="user_id"),
			inverseJoinColumns=@JoinColumn(name="role_id")
			
			)
	private List <Role> roles = new ArrayList<>();


	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}
}
