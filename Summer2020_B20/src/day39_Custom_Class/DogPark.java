package day39_Custom_Class;

public class DogPark {
    public static void main(String[] args) {
        //dogPark
   //     Dog dog1 = new Dog();
        Dog[] dogPark = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        //                  0           1       2           3           4
        dogPark[0].setDogInfo("Frank", "Colli", "blue", 2, "small");
        dogPark[1].setDogInfo("Lizzy", "dog", "White", 1, "medium");
        dogPark[2].setDogInfo("Vasil", "American Bulldog", "Black", 3, "big");
        dogPark[3].setDogInfo("Kimberley", "poodle", "Blond", 6, "medium");
        dogPark[4].setDogInfo("Kilka", "husky", "grey", 4, "big");



        for(int i = 0; i<=dogPark.length-1; i++){
            dogPark[i].getDogInfo();

        }

        System.out.println("==================");

        for(Dog eachDog: dogPark){
            eachDog.getDogInfo();

        }
        System.out.println("========================");


        String drink = "milk";

        for(Dog eachDog: dogPark){
            eachDog.Eat("Royal Canine");
        }
        System.out.println("==============");

        for(Dog eachDog: dogPark){
            eachDog.drink(drink);
        }



    }
}
