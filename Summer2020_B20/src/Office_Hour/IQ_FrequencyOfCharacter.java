package Office_Hour;

public class IQ_FrequencyOfCharacter {

    public static void main(String[] args) {
        String str = "AAABBCDD";
        String expectedResult = "";

        for(int i =0; i<=str.length()-1; i++){
            int count =0;
            for(int j =0; j< str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            expectedResult+=str.charAt(i)+""+count;
            str = str.replace(""+str.charAt(i), "");
        }
        System.out.println(expectedResult);
    }
}




