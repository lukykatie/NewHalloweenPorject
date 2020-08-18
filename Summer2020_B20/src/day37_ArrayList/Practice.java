package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        //DO NOT USE BELOW

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,445,5,65,4,3,2,1));
        System.out.println(list);

        //remove all the numbers that are less than 5

        for(int i =0; i<=list.size()-1; i++){
            if(list.get(i)<5){
                list.remove(i);
            }

        }

        System.out.println(list);


    }
}
