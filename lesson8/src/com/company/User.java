package com.company;

public class User implements Cloneable {
    public String name;
    public String login;
    public User (String name, String login){
        this.name=name;
        this.login=login;
    }


    public User (User u){
        this (u.name, u.login);



    }

    @Override
    public User clone () throws CloneNotSupportedException {
        return (User)super.clone();

    }
      public Message message;


}
