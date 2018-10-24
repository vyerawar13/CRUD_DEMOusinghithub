package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Login 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int lid;
private String uname;
private String pass;
@OneToOne(cascade=CascadeType.ALL)
private User user;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}
