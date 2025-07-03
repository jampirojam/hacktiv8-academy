package com.springtest.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springtest.test.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
