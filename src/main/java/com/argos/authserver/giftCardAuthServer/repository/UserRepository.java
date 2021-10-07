package com.argos.authserver.giftCardAuthServer.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.argos.authserver.giftCardAuthServer.entity.User;

@Repository
@Transactional
public interface UserRepository  extends JpaRepository<User, Integer>{

	

	

	User findByusername(String username);
	

}
