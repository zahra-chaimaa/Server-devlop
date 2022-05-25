package com.demo.infection.model;

import com.demo.infection.jcolibri.cbrcore.CBRQuery;
import com.demo.infection.jcolibri.cbrcore.CaseComponent;
import com.demo.infection.jcolibri.exception.ExecutionException;
import com.demo.infection.jcolibri.util.FileIO;


import java.io.IOException;
import java.net.URL;

public class main {
    public static void main(String[] args) throws ExecutionException {
        System.out.println("This is the main function is package com.demo.second");
        System.out.println("######################");
       URL file = FileIO.findFile("C:/demo-Serveur1-Devlop/demo-Serveur1-develop/demo/src/main/java/com/demo/infection/model/databaseconfig.xml");
        System.out.println("**"+ file);





            /********* Query Definition **********/

          CaseDescription queryDesc=new CaseDescription();
            // queryDesc.setAccommodation(TravelDescription.AccommodationTypes.ThreeStars);
        queryDesc.setId(101);
        queryDesc.setNip("true");
        queryDesc.setJ("21/03/2022");
        queryDesc.setSa("true");
        queryDesc.setT(39.7);
        queryDesc.setHt("false");
        queryDesc.setAus("true");
        queryDesc.setDes("true");
        queryDesc.setKt("false");
        queryDesc.setAbl("true");
        queryDesc.setInfkt("true");
        queryDesc.setSec("true");
        queryDesc.setMsec("true");
        queryDesc.setTou("true");
        queryDesc.setDys("true");
        queryDesc.setSu("false");
        queryDesc.setPyu("false");
        queryDesc.setBrm("false");
        queryDesc.setDsp("true");
        queryDesc.setFr("false");
        queryDesc.setLu("false");
        queryDesc.setGb(23);
        queryDesc.setCrp(138);
        queryDesc.setPct(54);
        queryDesc.setRx("true");

        test1 test = new test1();
        test.configure();
        System.out.println("la configuration succée");
        test.preCycle();
        System.out.println("precycle marche");
        CBRQuery query = new CBRQuery();
        query.setDescription((CaseComponent) queryDesc);

        test.cycle(query,2);
System.out.println("cycle marche");


            //	System.out.println("Cycle finished. Type exit to idem");
            //}while(!reader.readLine().equals("exit"));








            //  try {
        // System.out.println("Running configure()");
        //test.configure();

        //System.out.println("Running preCycle()");
        //test.preCycle();
        //System.out.println(test.mycases);
        //System.out.println("Items of the case a");
        // for(CBRCase c: test.mycases.getCases())
        //    System.out.println(c);
        //The cycle will require a query description, so we'll make it before calling the cycle

        //System.out.println("Running the cycle");
        //} catch (ExecutionException e) {
        //  e.printStackTrace();
        //}

        // }
    }
}
