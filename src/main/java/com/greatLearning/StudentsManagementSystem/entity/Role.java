
	package com.greatLearning.StudentsManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
	@Table(name="roles")
	@Data

	public class Role {
		
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="role_id")
		private Integer id;
		
		@Column(name = "name")
		private String name;

		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}
		
		

	}

