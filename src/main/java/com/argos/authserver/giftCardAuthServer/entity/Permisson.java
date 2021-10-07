package com.argos.authserver.giftCardAuthServer.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hamcrest.BaseDescription;

@Entity
@Table(name="permission")
public class Permisson extends BaseId {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
