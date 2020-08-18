package day39_Custom_Class;

public class DogObjects {


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Frenchie", "French Bulldog", "Blue", 2, "small");
        dog2.setDogInfo("Simba", "Labrador", "Gold", 1, "big");
        dog3.setDogInfo("Chase", "Maltipoo", "Brown", 3, "medium");


        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

      dog1.Eat("Roal Canine");
      dog2.Eat("Steak");
      dog3.Eat("Eggs");

      dog1.drink("Cola");
      dog2.drink("Water");
      dog3.drink("Mojito");

    }
}
