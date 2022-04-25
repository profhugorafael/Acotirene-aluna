package com.example.model.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username;
	private int typeOfUser; // foreign key
	
	public User(int id, String name, int typeOfUser) {
		this.id = id;
		this.username = name;
		this.typeOfUser = typeOfUser;
	}
	
	public int getId() {
		return id;
	}
	
	public String getusername() {
		return username;
	}
	
	public int getTypeOfUser() {
		return typeOfUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTypeOfUser(int typeOfUser) {
		this.typeOfUser = typeOfUser;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", typeOfUser=" + typeOfUser + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeOfUser, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && typeOfUser == other.typeOfUser && Objects.equals(username, other.username);
	}
	  
	

}
