package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat ();
        cat.name = "Vasya";
       // cat.sleep(4);
       // cat.sleep(10,50);
        cat.color = "Purple";
        //cat.Voice();

        String s= "Melarossa";
        //Приведение к нижнему регистру
        s.toLowerCase();
        String lc= s.toLowerCase();
        System.out.println (lc);
       // System.out.println (s.toUpperCase());


        //Нахождение номера символа в строке

        System.out.println (s.indexOf ("rossa"));
        //Сравнение не зависимо от регистра

        if ( s.equalsIgnoreCase("MeLArossa") )
        {
            System.out.println ("Строки равны");

            String f= String.format ("Меня зовут %s.\t я люблю спать %d часов", "Алина", 7);
            System.out.println (f);

        }



    }


}
