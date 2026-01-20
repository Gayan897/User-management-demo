package com.sample2.sample2.repository;

import com.sample2.sample2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> { //defines the datatypes which wants the services and controllers

}
