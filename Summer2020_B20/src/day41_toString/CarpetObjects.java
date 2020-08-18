package day41_static;

import java.util.ArrayList;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5, 3.5, 7.5, false);
        carpets[1].customOrder(7, 8, 6.5, true);
        carpets[2].customOrder(8, 4, 6.3, false);
        carpets[3].customOrder(2, 5, 4.6, false);
        carpets[4].customOrder(3, 7, 3.5, true);

        for (Carpet each : carpets) {
            each.getCarpetInfo();
        }


        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpet = new ArrayList<>();
        for (Carpet each : carpets) {
            if( each.isPersion) {
                persianCarpets.add(each);
            }else{
                regularCarpet.add(each);
            }
        }

    /*    for (int i = 0; i <= carpets.length-1; i++) {
            if (carpets[i].isPersion) {
                persianCarpets.add(carpets[i]);
            }else{
                regularCarpet.add(carpets[i]);
            }
        }*/
        System.out.println("Number of persion carpets " + persianCarpets.size());
        System.out.println("Number of regular carpets " + regularCarpet.size());



    }
}
