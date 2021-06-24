package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.Login;
import com.springmvc.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
  
  List<User> getUsers();
  
  boolean deleteUser(String username);
  
  int editUser(User user);
  

}
