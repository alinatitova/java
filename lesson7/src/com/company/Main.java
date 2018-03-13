package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
      /*Book b1=new Book();
      b1.setBookname("njknjnj");
      b1.setAuthor("bhbhb");

      Book b2=new Book();
      b2.setBookname("hnjcnjc");
      b2.setAuthor("sassd");

      EBook b3=new EBook ();
      b3.setAuthor("dcbjc");
      b3.setBookname("lkkmmi");

      showAuthor(b1);
      showAuthor(b2);
      showAuthor(b3);

      int a = 10;
      int b = a++;
      System.out.println(b);


      b1.author.setName ("Book4");
      System.out.println(b1.getBookName());*/


      Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.set(Calendar.MONTH, 6);
        c.add(Calendar.YEAR, -5);
        c.getTime(); //получаем объект типа date

        GregorianCalendar gc= (GregorianCalendar) GregorianCalendar.getInstance();
        if (gc.isLeapYear(2020)){
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }

        System.out.println(c);
    }



    public static void showAuthor (IBook b){
        System.out.println (b.getAuthor());
    }



}

