package com.wynats.portfolio.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Person {
	@Id
	private String id;

	private String name;
	private String description;

	

}
