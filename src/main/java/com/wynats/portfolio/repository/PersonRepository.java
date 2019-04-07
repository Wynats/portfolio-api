package com.wynats.portfolio.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wynats.portfolio.entity.Person;
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
@CrossOrigin(origins = "http://localhost:4200")
public interface PersonRepository extends PagingAndSortingRepository<Person, String> {

}
