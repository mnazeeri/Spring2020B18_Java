package day35_Static;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "BOA", 125000, true);
        //System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("KY", "CapitalOne", 130000, false);
        //System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("MD", "Chase", 95000, false);

        Offer offer4 = new Offer();
        offer4.setInfo("BayArea", "Google", 115000, false);

        Offer offer5 = new Offer();
        offer5.setInfo("TX", "MTZ", 140000, true);

        Offer[] offers = {offer1, offer2, offer3, offer4,offer5};

        String myLocation = "TX";

        ArrayList<Offer> accept = new ArrayList<>(Arrays.asList(offers));
        // accept.removeIf(each-> each.salary < 100000 || each.isFulltime == false || !each.location.equals(myLocation));

        accept.removeIf(each-> each.salary < 100000);
        accept.removeIf(each ->each.isFulltime == false);
        accept.removeIf(each -> !each.location.equals(myLocation));



        System.out.println(accept.size());

        for ( Offer eachOffer : accept){
            System.out.println(eachOffer);
        }


    }



}
