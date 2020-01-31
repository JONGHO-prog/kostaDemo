package com.naviworks.acme.sme;

import com.naviworks.acme.customer.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InstructorRepository extends CrudRepository<Customer,Long> {
}
