package com.firtproject.cursoudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firtproject.cursoudemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
