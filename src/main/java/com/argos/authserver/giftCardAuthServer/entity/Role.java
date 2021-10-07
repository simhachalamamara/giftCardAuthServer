package com.argos.authserver.giftCardAuthServer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Role extends BaseId {

	private String name;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "permission_role", joinColumns = {
			@JoinColumn(name = "role_id", referencedColumnName = "id") }, inverseJoinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "id"))
	private List<Permisson> permissions;

	public List<Permisson> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permisson> permissions) {
		this.permissions = permissions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
