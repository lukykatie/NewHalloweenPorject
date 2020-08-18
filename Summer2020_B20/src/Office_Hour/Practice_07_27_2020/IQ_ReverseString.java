package Office_Hour.Practice_07_27_2020;

public class IQ_ReverseString {

    public static void main(String[] args) {
//Ex: Reverse("ABCD"); ==> DCBA

        String toReverse = "ABC1DEF2";

        String Reversed = "";

        for(int i=toReverse.length()-1; i>=0; i--){
            Reversed+=toReverse.charAt(i);

        }
        System.out.println(Reversed);


    }
}
