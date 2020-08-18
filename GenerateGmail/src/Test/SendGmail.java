package Test;

import Library.Util;

public class SendGmail {
    /*
               first Step:
                   go to  :
                        https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                           Make sure that your google account allows third part app
    */
    public static void main(String[] args) {
        // credentials
        String userName = "lukykatie@gmail.com";
        String passWord = "Zadolbali155";
        // email:
        String [] receiver ={ "kat.pinets@gmail.com",
           "lukykatie@gmail.com"};
        String subject = "Katie Pinets";
        String text = "Hi Muhtar, you made it fun today";

        int times=5;
        int count =1;
        while(times>0){

            for(String each: receiver){
                System.out.println("Sending to " + each +" "+ count++);
                Util.sendEmails(userName, passWord, each, subject, text);

        }
            times--;

        }



        System.out.println("complete");

    }
}