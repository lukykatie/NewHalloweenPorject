package day41_static;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {


    public static void main(String[] args) {

            Cat[] catCattery = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
            catCattery[0].setCatInfo("Berta", 2, "Female", "Tortie", "Sphynx");
            catCattery[1].setCatInfo("Simba", 9, "Female", "Bicolor", "Sphynx");
            catCattery[2].setCatInfo("Benya", 1, "Male", "White", "Elf");
            catCattery[3].setCatInfo("Buffy", 2, "Female", "White", "Dwelf");
            catCattery[4].setCatInfo("Tim", 3, "Male", "Blue", "Sphynx");


            ArrayList<Cat> femaleCats = new ArrayList<>();
            femaleCats.addAll(Arrays.asList(catCattery));
            femaleCats.removeIf(p-> p.gender=="Male");

            ArrayList<Cat> maleCats = new ArrayList<>();
            maleCats.addAll(Arrays.asList(catCattery));
            maleCats.removeIf(p-> p.gender=="Female");

        System.out.println("Number of female cats" + femaleCats.size());
        System.out.println("Number of male cats" + maleCats.size());
        }
}
