package com.wynats.portfolio.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
	private HashMap<String, Integer> skills;
}
