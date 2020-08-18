package day39_Custom_Class;

public class Dog {
/*
instance variables:
breed, size, age, color

instance methods:
seDogInfo, getDogInfo, eat, drink, sleep



 */

    String breed;
    String color;
    int age;
    String size;
    String name;
    //String dogBreed is an argument

public void setDogInfo(String dogName, String dogBreed, String dogColor, int dogAge, String dogSize) {
    breed = dogBreed;
    size = dogSize;
    age = dogAge;
    color = dogColor;
    name = dogName;

    //Functionality of this method: it sets the info of the dog
    //Benefit of this method:
}

    public void getDogInfo(){
        System.out.println("Name: " + name+ ", " + "Breed: "+ breed+ ", "+ "Size: "+size+", " + "Color: " + color);
    }
    //prints the dog info


    //Creating action for the class:

    public void Eat(String Food){
        System.out.println(name+ " is eating "+ Food);
    }


   public void drink(String drink){

       System.out.println(name + " is drinking "+ drink);
   }


   public void sleep(String sleep){
       System.out.println(name + " is sleeping" +sleep);
   }
    /*


     */

}


