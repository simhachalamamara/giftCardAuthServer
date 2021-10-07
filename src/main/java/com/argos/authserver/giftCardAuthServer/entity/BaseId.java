package com.argos.authserver.giftCardAuthServer.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GeneratorType;

@MappedSuperclass
public class BaseId {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

}
