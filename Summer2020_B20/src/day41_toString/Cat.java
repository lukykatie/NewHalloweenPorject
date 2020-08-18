package day41_static;

public class Cat {

    String name = "";
    int age;
    String gender;
    String color;
    String breed;

    public void setCatInfo(String name, int age, String gender, String color, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.breed = breed;
    }

    public String toString() {
        return "Cat's name:" + name + ", age: " + age + ", gender: " + gender + ", color: " + color + ", breed: " + breed;
    }

    public void Eat(String Food) {
        System.out.println(name + " is eating " + Food);
    }

    public void Drink(String Drink){
        System.out.println(name+ " is drinking " + Drink);
    }
}
