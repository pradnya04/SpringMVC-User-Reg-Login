package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.dao.UserDao;
import com.springmvc.model.Login;
import com.springmvc.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }
  
  public List<User> getUsers() {
	    return userDao.getUsers();
  }
  
  public boolean deleteUser(String username) {
	  return userDao.deleteUser(username);
  }
  

   public int editUser(User user) {
	   return userDao.editUser(user);
}


}
