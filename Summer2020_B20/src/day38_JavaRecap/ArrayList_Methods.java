package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {

    public static void main(String[] args) {

        //remove, size, set, get, equals, contains, clear

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Mercedes", "Lexus", "Infinity", "Tesla", "Malibu", "Mazda", "Ford", "Ferrari"));
        //                          0       1           2       3           4

        cars.remove(3); // to remove Infinity
        //or
        cars.removeIf(each-> each=="Infinity");
        cars.removeAll(Arrays.asList("Tesla"));
        //or
        cars.remove("Infinity");

        cars.removeIf(each-> each.toLowerCase().contains("m"));
        cars.retainAll(Arrays.asList("Tesla"));

        System.out.println(cars);

        System.out.println("========================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs", "milk", "mango", "goat cheese", "lobasa", "lobster", "kilka"));

        boolean r1 = groceryList.contains("mango");
        System.out.println(groceryList);
        System.out.println(r1);

        groceryList.containsAll(Arrays.asList("mango", "milk"));

        System.out.println("Total Number of Itmes "+groceryList.size());

       //set mango fruit for mango

        groceryList.set(2, "apple");
        System.out.println(groceryList);

        groceryList.set(groceryList.indexOf("lobasa"), "toilet paper");
        System.out.println(groceryList);
        }
    }

