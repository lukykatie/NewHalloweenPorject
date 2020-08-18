package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practices {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("SHala");
        students.add("Vishn");
        students.add("Krishna");
        students.add("Katusha");

        boolean result = students.containsAll(Arrays.asList("Krishna", "Katusha"));
        System.out.println(result);

        System.out.println("===============");
        ArrayList<Integer> numbers = new ArrayList<>();

        //add : 30, 25, 40, 15

        //Integer[] nums = {30,40,50,78,68,70};

        numbers.addAll(Arrays.asList(30,40,50,78,68,70));
        System.out.println(numbers);

        System.out.println("===================");

        ArrayList<String> group1 = new ArrayList<>();
        //add all student names in your group
        //verify your close friend names contained in the list;

        group1.addAll(Arrays.asList("Ali", "Zylfia", "Asiya", "SaiM"));
        boolean result2 = group1.containsAll(Arrays.asList("Zylfia", "Asiya"));

        System.out.println(result2);

        System.out.println("==================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,5,6,7,8,8));
        // remove all 1,2,3
        System.out.println(list2);

        list2.removeAll(Arrays.asList(1,2,8));

        System.out.println(list2);

        System.out.println("============");

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,1,2,2,3,4,5));

        System.out.println(num1);
        //only keep 2,4,5

        num1.retainAll(Arrays.asList(2,4,5));
        System.out.println(num1);

        System.out.println("=================");

        ArrayList<String> employeeNames = new ArrayList<>();
        employeeNames.addAll(Arrays.asList("Muhtar", "Muradil", "Lisa", "Alice"));
        System.out.println(employeeNames);

        employeeNames.removeAll(Arrays.asList("Muhtar"));
        System.out.println(employeeNames);

        employeeNames.retainAll(Arrays.asList("Lisa"));
        System.out.println(employeeNames);


    }
}
