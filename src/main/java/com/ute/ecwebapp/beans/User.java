package com.ute.ecwebapp.beans;

import java.time.LocalDateTime;

public class User {
  private int id;
  private String username, password, name, email;
  private LocalDateTime dob;
  private int permission;

  public User() {
  }

  public User(int id, String username, String password, String name, String email, LocalDateTime dob, int permission) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.permission = permission;
  }

  public int getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public LocalDateTime getDob() {
    return dob;
  }

  public int getPermission() {
    return permission;
  }
}
