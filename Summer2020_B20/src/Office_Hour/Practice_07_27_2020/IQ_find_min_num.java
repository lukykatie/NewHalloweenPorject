package Office_Hour.Practice_07_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class IQ_find_min_num {

    public static void main(String[] args) {
        int []num = {1,2,34,5,};

        System.out.println(maxnum(num));

    }

    public static int maxnum(int[] num){

        Arrays.sort(num);

        return num[num.length-1];



    }
}
