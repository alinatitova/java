package com.company;

import java.io.*;
import java.util.Date;

public class Main {

    public static void main(String[] args){
	/*User u1=new User ("user", "user@mail.ru");
	u1.message = new Message ();
	u1.message.text="Hello";
	u1.message.time =new Date();

	User u2=new User (u1);
	System.out.println (u2.login+" "+u2.name);

		User u3 = null;

	      try {
			u3=u1.clone ();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println (u3.login+" "+u3.name+" "+u3.message.text);*/

		File f =new File("1.txt");
		if (!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		if (f.isHidden()){
			System.out.println ("файл скрыт");
		}
		//f.setWritable(false);
		if (!f.canWrite()){
			System.out.println ("файл доступен только для чтения");

		}
		//f.delete();

		/*System.out.println (f.lastModified());*/

		File f2=new File ("2.txt");
		f.renameTo (f2);


		File dir=new File ("test\\");
		if (!dir.exists ()){
			dir.mkdir();
		}

		dir.list();
		String files []=dir.list();
		for (int i=0; i<files.length; i++){
			System.out.println (files[i]);
		}

		//записываем информацию в файл
		try {
			PrintWriter pw=new PrintWriter("1.txt", "UTF-8");
			pw.append ("Hello world");
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}


		File files2 []=dir.listFiles();




	}


}