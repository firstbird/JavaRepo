package com.testHibernate.domain;
// Generated 2016-9-20 8:09:13 by Hibernate Tools 5.1.0.Beta1

/**
 * Usernet generated by hbm2java
 */
public class Usernet implements java.io.Serializable {

	private Integer id;
	private Users users;
	private String name;
	private Byte isPrimary;

	public Usernet() {
	}

	public Usernet(String name) {
		this.name = name;
	}

	public Usernet(Users users, String name, Byte isPrimary) {
		this.users = users;
		this.name = name;
		this.isPrimary = isPrimary;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getIsPrimary() {
		return this.isPrimary;
	}

	public void setIsPrimary(Byte isPrimary) {
		this.isPrimary = isPrimary;
	}

}
