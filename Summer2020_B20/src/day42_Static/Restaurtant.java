package day42_Static;

import java.util.ArrayList;

public class Restaurtant {

    String Owner;
    String Location;
    int numberOfStars;


    ArrayList<Server_Restaurant> servers = new ArrayList<>();
    ArrayList<Chef_Restaurant> chefs = new ArrayList<>();


    public void setInfo(String Owner, String Location, int numberOfStars ){

        this.Owner=Owner;
        this.Location=Location;
        this.numberOfStars=numberOfStars;
    }

}
