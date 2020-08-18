package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,7));

        list.removeIf(p-> Collections.frequency(list, p)==1);
        System.out.println(list);

        System.out.println("===============");

        //of first and last characters are the same
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan"));
        names.removeIf(p-> p.toLowerCase().charAt(0)== p.charAt(p.length()-1));
        System.out.println(names);

        System.out.println("======================");

        ArrayList<Integer> grades = new ArrayList<>();

        grades.addAll(Arrays.asList(100,900,78,56,80, 95, 65, 43, 78));

        ArrayList<Integer> gradeofA = new ArrayList<>(); //90-100
        ArrayList<Integer> gradeofB = new ArrayList<>(); //80-89
        ArrayList<Integer> gradeofC = new ArrayList<>(); //70-79
        ArrayList<Integer> gradeofD = new ArrayList<>(); //60-69
        ArrayList<Integer> gradeofF = new ArrayList<>(); //below 60

        //HOw many students got which grade

        gradeofA.addAll(grades);
        gradeofA.removeIf(p-> p<90 && p>100 );
        System.out.println(gradeofA);

    }
}
