package com.jorge.tokenvalidation.repository;

import com.jorge.tokenvalidation.model.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
}
