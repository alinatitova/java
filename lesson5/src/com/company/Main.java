package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* User u = new User ();
        u.id = 1;
        u.login = "user@mail.ru";
        System.out.println (u.toString());

        User u2 = new User ();
        u2.id = 1;
        u2.login = "user@mail.ru";

        if (u.equals(u2)) {
            System.out.println ("u=u2");
        } else {
            System.out.println ("u!=u2");
        }

        if (u == u2) {
            System.out.println ("u=u2");
        } else {
            System.out.println ("u!=u2");
        }
        User u3 = new User ();
        u3.id=100;
        u3.login = u2.login;
      //  System.out.println (u2);
        //System.out.println (u3);


        User u4 = new User (10, "some@user");
        System.out.println (u4);*/


        Scanner s = new Scanner (System.in);
        while (true) {
            System.out.print ("Введите целое число ");

            try {
                s.nextInt();
                System.out.println ("Ура!");
                break;
            }
            catch (Exception e) {
                System.out.println ("Повторите попытку:(");
                System.out.println (e.getLocalizedMessage());
                s.nextLine();
            }


        }

    }


}
