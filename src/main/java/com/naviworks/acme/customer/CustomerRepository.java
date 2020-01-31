package com.naviworks.acme.customer;

import com.naviworks.acme.cource.LearningObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
