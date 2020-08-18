package day42_Static;



class Test{
    int a ;
    static int b ;


}

public class StaticVariable {

    public static void main(String[] args) {
        Test obj1 = new Test ();
        obj1.a=5;
        obj1.b=20;  //since b is static one we assign its value it will be the same for all objects

        Test obj2 = new Test();
        obj2.a=10;
        obj2.b=30; //since b is static it's value will be reassigned and the same for all objects

        System.out.println(obj1.a); //5
        System.out.println(obj2.a); //10

        System.out.println(obj1.b); //20
        System.out.println(obj2.b); //20
    }
}
