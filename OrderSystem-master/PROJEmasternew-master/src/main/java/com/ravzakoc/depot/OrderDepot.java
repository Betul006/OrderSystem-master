package com.ravzakoc.depot;

import orderingtypes.OrderOrganisation;
import orderingtypes.OrderingMealAndOrganisation;

import java.util.ArrayList;

public class OrderDepot extends OrganisationList {

    public OrderDepot() {
        this.organisationList = new ArrayList<>();
        this.foodList = new ArrayList<>();
        this.foodandorgList=new ArrayList<>();
    }

    // SiparisDeposu.java dosyasının içi

    public void organisationList() {
        System.out.println("\n--- ORGANİSATİON LİST ---");
        if (organisationList.isEmpty()) {
            System.out.println("There are currently no event organization orders.");
        } else {
            for (OrderOrganisation org : organisationList) {
                // ToString metodunu çağırarak ekrana basar
                System.out.println(org.toString());
            }
        }
    }

    public void foodList() {
        System.out.println("Food List ");
        if (foodList.isEmpty()) {
            System.out.println("There are currently no food orders.");
        } else {
            for (String yemek : foodList) {
                System.out.println("- " + yemek);
            }
        }
    }
    public void organisationAndFoodList() {
        System.out.println("ORGANİSATİON AND FOOD");
        if (foodandorgList.isEmpty()) {
            System.out.println("There are currently no organization or food orders");
        } else {
            for (OrderingMealAndOrganisation orderingMealAndOrganisation : foodandorgList) {
                // Burada nesneyi yazdırmalısınız
                System.out.println("- " + orderingMealAndOrganisation.toString());
            }
        }
    }
}
