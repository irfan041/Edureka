package com.demo.spring.mockito.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.spring.mockito.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findByAddress(String address);

}
