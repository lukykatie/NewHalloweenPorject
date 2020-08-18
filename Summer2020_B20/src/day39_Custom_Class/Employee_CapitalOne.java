package day39_Custom_Class;

public class Employee_CapitalOne {

    public static void main(String[] args) {
        Employe employee1 = new Employe();
        Employe employee2 = new Employe();
        Employe employee3 = new Employe();
        Employe employee4 = new Employe();
        Employe employee5 = new Employe();

        employee1.setEmployeeInfo("Roman", "QA", 90000, 'M', 17657898 );
        employee1.getEmployeeInfo();
    }
}
