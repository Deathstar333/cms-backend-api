package com.wipro.springboot.cmsbackendapi.repository;

import com.wipro.springboot.cmsbackendapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
