package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,40,38,89));
        // MAXIMUM NUMBER
       Integer maxnum =  Collections.max(list);
       Integer minum = Collections.min(list);

        System.out.println("Maximum number: " +maxnum);
        System.out.println("Minimum number: " +minum);

        System.out.println("==============");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Muhtar","Masha", "Muhtar", "Ramazan"));
        Collections.replaceAll(names, "Muhtar", "HFatih");
        System.out.println(names);
    }
}
