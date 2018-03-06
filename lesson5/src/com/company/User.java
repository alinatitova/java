package com.company;

public class User {
public int id;
public String login;

   @Override
    public String toString () {
       String userInfo = String.format ("User id: %d, login: %s", id, login);
       return userInfo;

   }

    @Override
    public boolean equals (Object obj) {
       User user = (User)obj;
       if (user.id ==id && user.login == login) {
           return true;
       }
       return false;
    }

    @Override
    public int hashCode(){
       return 123;
    }

    public User () {
        System.out.println ("new user created");
    }

    public User (int id, String login){
       this.id=id;
       this.login = login;


    }

}
