package com.edu;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emphibernate")
public class Employee {
@Id
private int eid;
@Column(length=20)
private String ename;
@Embedded
Address address;
public Employee(int eid, String ename, Address address) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.address = address;
}


public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public Employee()
{
	super();
	
}



}
