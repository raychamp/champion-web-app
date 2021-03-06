package com.web.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "role" }) })
public class Role implements Serializable {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String role;

//	@ManyToMany(cascade = CascadeType.ALL)
	private List<Permission> permissions = new ArrayList<Permission>();

	Role() {
		// For ORM
	}

	public Role(String role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
}

