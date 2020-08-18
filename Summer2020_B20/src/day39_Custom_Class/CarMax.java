package day39_Custom_Class;

public class CarMax {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.seInfo("Audi", "A5", 2015, "Red", 89000, 10000);
        car1.getInfo();

        car2.seInfo("BMW", "X5", 2015, "Black", 67000, 15000);
        car2.getInfo();

        car3.seInfo("Toyota", "Corolla", 2011, "White", 78000, 56000);
        car3.getInfo();

        car4.seInfo("Lexus", "GX460", 2018, "White", 30000, 35000);
        car4.getInfo();

        car5.seInfo("Corolla", "5676gjh", 2016, "Red", 45000, 20000);
        car5.getInfo();

    }
}
