package Practice_08_12_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3));

        int a = 1;

        list1.remove(a); // when you pass a primitive it removes the index
        System.out.println(list1);

        Integer b = 1;

        list1.remove(b); // when ypu pass non primitive it removes a mathing object
        System.out.println(list1);

        System.out.println("==================");

        String[] names = {"Rob", "Bran", "Rick", "Bran"};
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        if (nameList.remove("Bran")) { //true, {"Rob", Rick, Bran}
            nameList.remove("John");


            System.out.println(nameList);
        }
        System.out.println("=======================");

        ArrayList<String> colors = new ArrayList<>();

        colors.addAll(Arrays.asList("Green", "Red", "Black", "White", "Yellow"));

        colors.add(3, "Cyan");

        System.out.println(colors);
        System.out.println("==================");


            ArrayList<Integer> list2 = new ArrayList<>();
            list2.addAll(Arrays.asList(1,2,3,4,5));
            list2.set(4, list2.get(0));

            list2.set(0, list2.get (4));

    }
}
