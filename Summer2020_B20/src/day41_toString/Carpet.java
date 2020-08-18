package day41_static;

public class Carpet {


    /*
    1. create a custom class for the Carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        getCarpetInfo(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets

     */
//instance variables:
double width;
double length;
double unitPrice;
boolean isPersion;

public void customOrder(double width, double length, double unitPrice, boolean isPersion ) { //local variable and instance variable can share the same name

    this.width = width;    //this. is used when local and instance variable share the same name
    this.length = length;
    this.unitPrice = unitPrice;
    this.isPersion = isPersion;

}
    public double calcCost(){  // we make this a return method bc the TotalPrice is the value the we want to use outside of this method.
    double totalPrice = (width*length)*unitPrice;
    if(isPersion) {
        totalPrice += 200;
    }
    return totalPrice; //return value must match with a return type of the method double == double

    }

    public void getCarpetInfo(){
        System.out.println("========================");
        System.out.println("width: " + this.width);
        System.out.println("length: " +length);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Persion Carpet: " +isPersion);
        System.out.println("Total Price: " + calcCost());

        System.out.println("==========================");
        }

        public String toString(){
    return "Width: " + width + ", Length: "+ length+ ", Persion: "+  isPersion;
        }
// instance local

}


