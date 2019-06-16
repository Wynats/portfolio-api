package com.wynats.portfolio.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wynats.portfolio.entity.Worker;
@RepositoryRestResource(collectionResourceRel = "workers", path = "workers")
@CrossOrigin(origins = "http://localhost:4200")
public interface WorkerRepository extends PagingAndSortingRepository<Worker, String> {
}

