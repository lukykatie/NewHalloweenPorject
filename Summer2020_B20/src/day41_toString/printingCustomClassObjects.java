package day41_static;

import java.sql.SQLOutput;

public class printingCustomClassObjects {

    public static void main(String[] args) {

        String str = new String ("Cyber");
        System.out.println(str.toString()); //object name
        System.out.println(new String("Cyber").toString()); //object

        System.out.println(str.toString());
        System.out.println(new String("Cyber").toString());

        System.out.println("======================");

        Carpet c1 = new Carpet();
        c1.customOrder(5,6,19, true);

        System.out.println(c1);
    }
}
