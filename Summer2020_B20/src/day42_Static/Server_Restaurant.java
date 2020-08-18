package day42_Static;

public class Server {

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
    public void takeOrder(){
        System.out.println(name +" is taking an order");
    }

    public void cleanTable(){
        System.out.println(name + " is cleaning the table");
    }

    public String toString(){
        return "Server's name is: "+ name + ". Is he full time? "+ fullTime+ ". His ID is: "+employeeID+", his hourly rate is:" +hourlyRate;
    }

}
