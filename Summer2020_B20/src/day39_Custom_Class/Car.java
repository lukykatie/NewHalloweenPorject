package day39_Custom_Class;

public class Car {

    /*  Class(car)
    Attributes of the car:
    Model
    Brand
    year
    mileage
    color
    VIN
    price
     */

    String brand;
    String model;
    String color;
    int year;
    double mileage;
    double price;

   // instnance method below:
    public void seInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice) {
        brand = carBrand;
        model = carModel;
        year = carYear;
        price = carPrice;
        mileage = carMileage;
        color = carColor;
    }
        public void getInfo() {
            System.out.println(year + ", " + brand + ", " + model + ", " + mileage + ", " + color + ", $" + price);
        }

            public void start(){
                System.out.println(brand + " "+ model+ " is started");
            }
        }








