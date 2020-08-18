package day40_CustomClassPractice;

import sun.security.x509.IssuerAlternativeNameExtension;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {


    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(104000, "VA", true, true, true, "SDET", false);
        offer2.setOfferInfo(75_000, "VA", false, false, false, "QA", true);
        offer3.setOfferInfo(125000, "VA", true, true, true, "SDET", true);
        offer4.setOfferInfo(100_000, "PA", false, true, false, "QA", true);
        offer5.setOfferInfo(100_000, "CA", true, false, true, "SDET", false);
        offer6.setOfferInfo(120000, "CO", false, true, false, "QA", true);
        offer7.setOfferInfo(100_000, "GA", true, true, true, "SDET", true);

        ArrayList<Offer> jobOffer = new ArrayList<>();
        jobOffer.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        for(Offer eachOffer : jobOffer){
            eachOffer.getOfferInfo();
        }
        System.out.println("====================");

        //remove if offer is less than 120k
       // jobOffer.removeIf(p->p.salary<120000);

        String myLocation = "VA";
                // remove if less than 120k or not from VA
        jobOffer.removeIf(p-> p.salary<120000 || p.location.equals("VA"));

        System.out.println("Number of offers:" + jobOffer.size());

        // remove if it doesn't have PTO or doesn't have benefit or is not full time
        jobOffer.removeIf(p-> p.haPTO == false || p.benefits==false || p.isFullTime==false);
        System.out.println("Number of Offers: " + jobOffer.size());
    }
}
