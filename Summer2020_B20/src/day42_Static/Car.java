package day42_Static;

public class Car {

    String brand;
    String model;
    int year;
    String Vin;
    String color;
    double price;

    static boolean hasWheel;
    static int numberOfTires = 4 ;
    static boolean hasEngine = true;
    static boolean hasDoors = true;
    static boolean hasAirBag = true;
    static boolean hasSeatBelt = true;

    public void start(){
        System.out.println("Starting " + brand+ " " + model);
    }
    public static void printTires(){
        System.out.println(numberOfTires+ "Tires");
    }
    public String toString(){
        return "Brand: "+brand + ", Model: " +model+ ", Year: "+year +", Color"+color+
        "\nNumber of ties: " +numberOfTires+"\nHAs engine: "+hasEngine+"\nHas Wheels: " +hasWheel+"\nHas Airbags"+hasAirBag;
    }

}
