package day42_Static;

public class Chef_Restaurant {

    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public void setInfo(String name, int employeeID, double hourlyRate, boolean fullTime ) {

        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;

    }
    public void makeOrder(){

        System.out.println(name + " is making order");
    }
    public void washDishes(){

        System.out.println(name + " is washing dishes");
    }

    public String toString(){
            return "Server's name is: "+ name + ". Is he full time? "+ fullTime+ ". His ID is: "+employeeID+", his hourly rate is:" +hourlyRate;
        }
}
