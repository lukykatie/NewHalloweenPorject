package day41_toString;

public class Tester {


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

    public String toString() {
        return "Name " + name + ", gender " + gender + ", salary: " + salary;

    }
    public void coding() {
        System.out.println(name + " is coding");
    }

    public void fixBugs() {
        System.out.println(name + " is crying");
    }
}
class TesterObject{
    public static void main(String[] args) {
        Tester [] testers = {new Tester(), new Tester(), new Tester(), new Tester()};
    testers[0].setInfo("Ahmed", 120000, "Male", 45 );
        testers[1].setInfo("Mohammed", 100000, "Male", 65);
        testers[2].setInfo("Mully", 78799, "Female", 45);
        testers[3].setInfo("Polly", 67888, "Male", 67);

        for(Tester each: testers){
            System.out.println(each);
        }
    }


}
