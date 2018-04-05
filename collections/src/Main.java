import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(20); //передаем параметр того же типа, что и выше
        list.add(30);
        System.out.println(list.get(1));
        list.remove (0);
        System.out.println(list);
        Integer a=20;
        list.remove (a);
        list.set (0,50);


        HashMap<Integer,String> contacts = new HashMap <Integer,String>();
        contacts.put (422676,"Ivanov");
        contacts.put (124435,"Titova");
        contacts.put (623562,"Ivanov");
        System.out.println(contacts);
        System.out.println(contacts.get (124435));
        contacts.remove (422676);
        System.out.println(contacts);






    }
}
