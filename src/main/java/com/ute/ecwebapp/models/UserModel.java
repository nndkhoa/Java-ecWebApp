package com.ute.ecwebapp.models;

import com.ute.ecwebapp.beans.User;
import com.ute.ecwebapp.utils.DbUtils;
import org.sql2o.Connection;

import java.util.List;

public class UserModel {
  public static User findByUsername(String username) {
    final String query = "select * from users where username = :username";
    try (Connection con = DbUtils.getConnection()) {
      List<User> list = con.createQuery(query)
        .addParameter("username", username)
        .executeAndFetch(User.class);

      if (list.size() == 0) {
        return null;
      }

      return list.get(0);
    }
  }

  public static void add(User c) {
    String insertSql = "INSERT INTO users (username, password, name, email, dob, permission) VALUES (:username,:password,:name,:email,:dob,:permission)";
    try (Connection con = DbUtils.getConnection()) {
      con.createQuery(insertSql)
        .addParameter("username", c.getUsername())
        .addParameter("password", c.getPassword())
        .addParameter("name", c.getName())
        .addParameter("email", c.getEmail())
        .addParameter("dob", c.getDob())
        .addParameter("permission", c.getPermission())
        .executeUpdate();
    }
  }
}
