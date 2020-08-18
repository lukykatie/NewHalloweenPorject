package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digits {

    public static void main(String[] args) {


    ArrayList<Character> chars = new ArrayList<>();

        chars.addAll(Arrays.asList('a','b','1', '2', '&', '*'));
        chars.removeIf(each-> Character.isDigit(each));
        System.out.println(chars);

        System.out.println("===============");

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a', '1', 'b', 'b', '2', '$', '#'));


        ArrayList<Character> digits = new ArrayList<>();  // [1,2]
        digits.addAll(list);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("digits" + digits);

        ArrayList<Character> letters = new ArrayList<>();  // [a,b,cd]
        letters.addAll(list);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> specialChar = new ArrayList<>(); //['&', '#'
        specialChar.addAll(list);

        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println("Special Characters: " + specialChar);

    }
}





