package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Settings s= new Settings ();
        s.posX=100;
        s.posY=200;
        s.fullScreen=false;

        User u=new User();
        u.name="Misha";
        u.avatar="img/1.png";

        System.out.println (s);
        System.out.println (u);




        //сериализация

        FileOutputStream fos =new FileOutputStream ("app.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);//пишем информацию любого типа (в данном случае объукт)
        oos.writeObject(s);
        oos.writeObject(u);//записываем объекты в этот файл
        oos.close ();
        fos.close();//закрываем потоки файлов, сначала последний, который писали, потом предыдущий (как бы зеркально)

        //десериализация

        FileInputStream fis= new FileInputStream("app.bin");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Settings s1=(Settings)ois.readObject(); //чтобы получить в типе Settings, потому что, когда засунули его в Объект, он стал Object
        User u1 =(User)ois.readObject(); //пишем в том же порядке!!!!!!!!
        ois.close();
        fis.close(); //Закрываем потоки
        System.out.println (s1);
        System.out.println (u1);


        //Потоки
       /* long t= System.currentTimeMillis();//возвращает время на момент объявления переменной в милисекундах
        /*for (int i=0; i<100000000; i++) {
            double d = Math.sin(i*2)+ Math.pow(i,3)- Math.sqrt(i/2);
        }*/
        /*System.out.println (System.currentTimeMillis()-t);*/ //выводим, сколько времени длился наш цикл (отняли от времени объявления пересенной время, когда закончился цикл)


        //Создаем поток
       /* Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<50000000; i++) {
                    double d = Math.sin(i*2)+ Math.pow(i,3)- Math.sqrt(i/2);
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=50000000; i<100000000; i++) {
                    double d = Math.sin(i*2)+ Math.pow(i,3)- Math.sqrt(i/2);
                }
            }
        });//Создали потоки, но не запустили

        t1.start ();
        t2.start();//Запустили потоки
        t1.join();
        t2.join();//приостанавливаем выполнение основного потока до тех пор, пока поток t1 не выполнится, потом будет ждат выполнения потока t2, потом продолжается выполнение основного потока
        System.out.println (System.currentTimeMillis()-t);*/

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1000000000; i++) {
                   update(1);
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1000000000; i++) {
                   update(-1);
                }
            }
        });
        t1.start ();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(n);



    }
    public static int n=0;
    public static synchronized void update (int d){ //пишем synchronized, чтобы выполнились ДВА потока (чтобы другой не умирал после выполнения первого)(один все равно в приоритете)
        n+=d; //увеличиваем переменную на d
    }
}
