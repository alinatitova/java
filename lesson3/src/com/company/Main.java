package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	float ages [] = new float [5];
	ages[0]= 13.5f;
	ages [1]=25;
	ages [2]=32;
	ages [3]=15;
	ages [4]=10.5f;

	float sum=0;
	for(int i=0; i< ages.length; i=i+1)
	{ sum = sum + ages [i];}
    float avg = sum/ages.length;
	System.out.println (avg);



		String fruits []= {"apple","orange","banana","lemon"};
		for(int i=0; i< fruits.length; i=i+1){System.out.println (fruits [i]);}



		User u1 = new User ();
		u1.age=20;
		u1.name="Petya";
		u1.male=true;
		u1.Say();
		u1.WhatIsYourName();
		User u2 = new User ();
		u2.name = "Katya";
		u2.male = false;
		u2.WhatIsYourName();



		String s;
		s.

    }
}
