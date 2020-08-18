package day41_toString;

import java.util.ArrayList;

public class CatObject {

    public static void main(String[] args) {



        Cat[] catCattery = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
        catCattery[0].setCatInfo("Berta", 2, "Female", "Tortie", "Sphynx");
        catCattery[1].setCatInfo("Simba", 9, "Female", "Bicolor", "Sphynx");
        catCattery[2].setCatInfo("Benya", 1, "Male", "White", "Elf");
        catCattery[3].setCatInfo("Buffy", 2, "Female", "White", "Dwelf");
        catCattery[4].setCatInfo("Tim", 3, "Male", "Blue", "Sphynx");


        //TO print list of cats:
        for(Cat each: catCattery){
            System.out.println(each);
        }
        System.out.println("==================");
     //   System.out.println(Arrays.toString(catCattery));


        for(Cat each: catCattery){
            each.Eat("Cat food");
        }
        for(Cat each: catCattery){
            each.Drink("Water");
        }

        ArrayList<Cat> femaleCats = new ArrayList<>();
        ArrayList<Cat> maleCats = new ArrayList<>();

        for(Cat each: catCattery){
            if(each.gender=="Male"){
                maleCats.add(each);
            }else{
                femaleCats.add(each);
            }
        }
        System.out.println(maleCats);
        System.out.println(femaleCats);


      /*  for(int i =0; i<catCattery.length-1; i++){
            if(catCattery[i].gender =="Male"){
                maleCats.add(catCattery[i]);

            }else{
                femaleCats.add(catCattery[i]);

            }

        }

       */

    }
}
