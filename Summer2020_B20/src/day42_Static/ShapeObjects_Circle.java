package day42_Static;

public class ShapeObjects {

    public static void main(String[] args) {
        // find the area of circle
        //r = 5;
        Circle c1 = new Circle();
        c1.setInfo(5);

        System.out.println(c1.calcPerimeter());
        System.out.println(c1.calcArea());

        System.out.println("=================");
        System.out.println(c1);

        System.out.println("=================");

        Circle c2 = new Circle();
        System.out.println(c2);

        System.out.println("=================");

        Circle c3 = new Circle();
        System.out.println(c3);

        int a =100;
       // static int b = 300; you can not create a static variable in any method, it got to be created outside of methods

    }
}
