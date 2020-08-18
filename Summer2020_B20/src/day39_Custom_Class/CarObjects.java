package day39_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
       /* car1.brand = "Toyota";
        car1.color = "Red";
        car1.mileage = 100777;
        car1.model = "Corola";
        car1.price = 78_676;
        car1.year = 2016;

       */
        //seInfo - sets info of the car
        car1.seInfo("BMW", "X5", 2016, "Red", 100678, 20500);


        System.out.println(car1.brand);
        System.out.println(car1.year);
        System.out.println(car1.model);
        System.out.println(car1.color);

        System.out.println("===============");
        Car car2 = new Car();

      /*  car2.brand = "BMW";
        car2.color = "black";
        car2.model = "X5";
        car2.year = 2017;

       */
        car2.seInfo("Toyota", "Corolla", 2016, "Black", 198000, 5000);

        System.out.println(car2.brand);
        System.out.println(car2.year);
        System.out.println(car2.model);
        System.out.println(car2.color);

        Car car3 = new Car();
        car3.seInfo("Audi", "A7", 2017, "White", 32000, 35000);

        car3.getInfo();

        Car car4 = new Car();

        car4.seInfo("BobCat", "Ghghh67", 2019, "yellow", 89, 560000);


        //to print car info we need to call getInfo that was created in Car class package day 39
        car4.getInfo();

        car3.start();
        car4.start();




    }
}
