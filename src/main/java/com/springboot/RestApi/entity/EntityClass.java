package com.springboot.RestApi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityClass {

	@Id
	private String courseId;
	private String courseName;
	private String courseDescription;
}
