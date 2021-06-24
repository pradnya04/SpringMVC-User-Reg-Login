package com.springmvc.model;

public class User {

  private String username;
  private String password;
  private String firstname;
  private String lastname;
  private String department;
  private String address;
  private String skills;
  private String city;
  private String employeeType;

  public String getEmployeeType() {
	return employeeType;
}

public void setEmployeeType(String employeeType) {
	this.employeeType = employeeType;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    System.out.println("username: " + username);
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getSkills() {
    return skills;
  }

  public void setSkills(String string) {
    this.skills = string;
  }
}
