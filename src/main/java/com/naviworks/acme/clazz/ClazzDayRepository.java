package com.naviworks.acme.clazz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClazzDayRepository extends CrudRepository<ClazzDay,Long> {
}
