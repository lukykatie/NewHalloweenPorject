package day37_ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Uniques_method {

    public static void main(String[] args) {


        String str = "AABBCDDE";
        String uniques = "";

        //to convert String into collection

        ArrayList<String> list = new ArrayList<>();

  /* for(char each  :str.toCharArray()){
            list.add(each);
           alternatove solution
        */

        for (String each : str.split("")) {
            list.add(each);
        }

        System.out.println(list);

        for (String each : list) {
            int count = Collections.frequency(list, each);
            if (count == 1) {
                uniques += each;

            }
        }
        System.out.println(uniques);

       int b =2;
       boolean res = ++b ==2 ||  --b ==2 && --b ==2;
        System.out.println(res);
    }
}


