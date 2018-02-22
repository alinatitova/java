package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* int age = 17;
        if (age >= 16) {
            System.out.println("Вы можете сдать на права");

        } else {
            System.out.println("Вы не можете сдать на права");
        }
    }
}*/
        int month = 15;
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        int i = 0;
        while (i < 10)
        {
            i=i+1;
            System.out.println(i);
            if (i==5)
            {
                break;
            }
        }

        int a=10;
        do
            {
            System.out.println("Hello!");
        }while (a<5);


        for (int c=0; c<10; c=c+1 )
        {
            System.out.println(Math.pow(c,3));
        }

        //чтение данных
        Scanner s=new
        Scanner (System.in);
        System.out.println("Введите ваш рост в метрах");
        float height=s.nextFloat ();
        System.out.print("Ваш рост в дюймах:");
        System.out.println(100*height/2.54);

        float usd= convertBYNtoUSD (10.5f);
        System.out.println (usd);
    }

   static float convertBYNtoUSD (float sum)
   {
        float usd=sum/1.96f;
        return usd;
    }









}