package day41_toString;

public class Developer {


    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender, int age) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;


    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void fixBugs() {
        System.out.println(name + " is crying");
    }

    public String toString() {
        return "Name " + name + ", gender " + gender + ", salary: " + salary;


    }

}

class DeveloperObject{
    public static void main(String[]args){
        Developer[] developers = {new Developer(), new Developer(), new Developer() };

        developers[0].setInfo("Ahmed", 120000, "Male", 45 );
        developers[1].setInfo("Mohammed", 90000, "Male", 54);
        developers[2].setInfo("Villy", 56000, "Female", 67);

        for(Developer each: developers){
           each.coding();
        }

        System.out.println("==============");

        }



}
