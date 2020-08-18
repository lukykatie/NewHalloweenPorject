package day38_JavaRecap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
list.addAll(Arrays.asList(100,96,95,87,98, 56, 45, 78, 54, 67, 68, 64));

        System.out.println(list);

        ArrayList<Integer> gradeA = new ArrayList<>();  // 90-100
        gradeA.addAll(list);
        gradeA.removeIf(each-> each < 90);
        System.out.println("Grade A: " +gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf(each-> each < 80 || each>89);
        System.out.println("Grade B: " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(each-> each<70 || each>79);
        System.out.println("Grade C: " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(each-> each<60 || each>69);
        System.out.println("Grade D: " + gradeD);

        System.out.println("=============");

        System.out.println(gradeA.size()+" students made A" );
        System.out.println(gradeB.size()+" students made B");
        System.out.println(gradeC.size()+" students made C");
        System.out.println(gradeD.size()+" students made D");




    }
}
