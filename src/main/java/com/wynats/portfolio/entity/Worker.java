package com.wynats.portfolio.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "workers")

@Data
public class Worker {

	@Id
	private String id;

	private String name;
	private String description;
}
