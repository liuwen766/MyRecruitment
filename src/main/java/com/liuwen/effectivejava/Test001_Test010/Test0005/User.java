package com.liuwen.effectivejava.Test001_Test010.Test0005;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/27 1:10
 * ----------------------------------------------------------------------
 **/
public class User {

  private String name;

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object obj) {
    if (obj instanceof User) {
      User person= (User) obj;
      if (person.getName() == null || name == null) {
        return false;
      }else{
        return name.equalsIgnoreCase(person.getName());
      }
    }
    return false;
  }
}
