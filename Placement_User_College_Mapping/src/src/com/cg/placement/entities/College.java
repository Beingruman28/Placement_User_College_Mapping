package com.cg.placement.entities;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//INSERT TABLE NAME THAT IS CREATED IN MYSQL(E.G_COLLEGE)
@Table(name="college1")   
public class College 
{
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "c_id")
private int id;
private User collegeAdmin;
private String collegeName;
private String location;

@OneToOne(mappedBy="college")
private User user;


//CREATE GETTERS AND SETTERS FOR ALL ATTRIBUTES
public int getId() {                             
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public User getCollegeAdmin() {
	return collegeAdmin;
}
public void setCollegeAdmin(User collegeAdmin) {
	this.collegeAdmin = collegeAdmin;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}

