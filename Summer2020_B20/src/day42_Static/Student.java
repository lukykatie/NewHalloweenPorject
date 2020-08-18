package day42_Static;

public class Student {

    String name;
    int age;
    int groupID;
    char gender;

    static String schoolName = "Cybertek School";
    static String favoritTeacher = "Muhtar";

    public void setInfo(String name, int age, int groupID, char gender){
        this.name = name;
        this.age = age;
        this.groupID=groupID;
        this.gender=gender;
    }

    public String toString(){ //instance method
            return "School Name: "+schoolName+ "\nStudent Name: " +name;
        }             //static variable               instance variable



}
