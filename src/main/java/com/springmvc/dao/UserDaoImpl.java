package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.model.Login;
import com.springmvc.model.User;

public class UserDaoImpl implements UserDao {

  @Autowired
  DataSource datasource;

  @Autowired
  JdbcTemplate jdbcTemplate;

	public int register(User user) {
    String sql = "insert into users values(?,?,?,?,?,?,?,?,?)";

    return jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
        user.getLastname(), user.getDepartment(), user.getAddress(), user.getSkills(), user.getCity(), user.getEmployeeType() });
  }

  public User validateUser(Login login) {
    String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
        + "'";
    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
  }
  
  public List<User> getUsers() {
	    String sql = "select * from users";
	    List<User> users = jdbcTemplate.query(sql, new UserMapper());

	    return users.size() > 0 ? users : null;
	  }



public boolean deleteUser(String username) {
	System.out.println("In delete" + username);
    String sql = "delete from users where username = ?";   
    return jdbcTemplate.update(sql, username) == 1;
  }

public int editUser(User user) {
    String sql = "update users set firstname= ?, lastname=?, address=?,department=?,skills=?,city=?,employeeType=? where username=?";   
    return jdbcTemplate.update(sql, user.getFirstname(),user.getLastname(), user.getAddress(),user.getDepartment(),user.getSkills(),user.getCity(),user.getEmployeeType(),user.getUsername() );
  }

}


class UserMapper implements RowMapper<User> {

  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();

    user.setUsername(rs.getString("username"));
    user.setPassword(rs.getString("password"));
    user.setFirstname(rs.getString("firstname"));
    user.setLastname(rs.getString("lastname"));
    user.setDepartment(rs.getString("department"));
    user.setAddress(rs.getString("address"));
    user.setSkills(rs.getString("skills"));
    user.setCity(rs.getString("city"));
    user.setEmployeeType(rs.getString("employeeType"));

    return user;
  }
}