package com.company;

public class Cat extends Animal {
    public String name;
    private int age;
    public void sleep (int h) {
        System.out.print("Кот заснул на ");
        System.out.print (h);
        System.out.print ("часов");
    }
    public void sleep (int h, int m) {
        System.out.print("Кот заснул на ");
        System.out.print (h);
        System.out.print ("часов ");
        System.out.print (m);
        System.out.print ("минут");
    }

@Override
    protected void Voice () {
        System.out.println ("Meow");



    }

}
