package com.naviworks.acme.cource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LearningObjectRepository extends CrudRepository<LearningObject,Long> {
}
