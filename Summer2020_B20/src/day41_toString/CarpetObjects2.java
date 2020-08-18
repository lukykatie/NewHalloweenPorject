package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5, 3.5, 7.5, false);
        carpets[1].customOrder(7, 8, 6.5, true);
        carpets[2].customOrder(8, 4, 6.3, false);
        carpets[3].customOrder(2, 5, 4.6, false);
        carpets[4].customOrder(3, 7, 3.5, true);


        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));  // converting Array to collection type (Arraylist) and add all acrpets persion and regular
        persianCarpets.removeIf(p-> !p.isPersion); //removing not persion carpets

        ArrayList<Carpet> regularCarpet = new ArrayList<>();
        regularCarpet.addAll(Arrays.asList(carpets));
        regularCarpet.removeIf(p-> p.isPersion);
        regularCarpet.removeAll(persianCarpets);

        System.out.println("Number of persion carpets" + persianCarpets.size());
        System.out.println("Number of regular carpets: " + regularCarpet.size());
    }
}
