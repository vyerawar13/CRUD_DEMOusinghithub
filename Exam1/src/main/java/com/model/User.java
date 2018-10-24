package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int uid;
private String name;
private String address;
private String mobile;
@OneToOne(cascade=CascadeType.ALL)
private Login login;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Login getLogin() {
	return login;
}
public void setLogin(Login login) {
	this.login = login;
}

}
