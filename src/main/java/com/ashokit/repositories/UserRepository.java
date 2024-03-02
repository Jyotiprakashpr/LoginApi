package com.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Serializable> {
	
	public UserEntity findByUserEmailandUserPwd(String userEmail, String pwd);

}
