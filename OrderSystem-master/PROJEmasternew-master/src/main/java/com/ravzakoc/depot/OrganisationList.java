package com.ravzakoc.depot;

import orderingtypes.OrderOrganisation;
import orderingtypes.OrderingMealAndOrganisation;

import java.util.List;
// generic ve liste kullanımı

public class OrganisationList {
    protected List<OrderOrganisation> organisationList;
    protected List<String> foodList;
    protected List<OrderingMealAndOrganisation> foodandorgList;


    public void addOrganisation(OrderOrganisation org) {
        organisationList.add(org);
    }

    public List<OrderOrganisation> getOrganisationList() {
        return organisationList;
    }


    public void addFood(String food) {
        foodList.add(food);
    }

    public List<String> getFoodList() {
        return foodList;
    }

    public void foodAndOrg(OrderingMealAndOrganisation mealAndOrganisation){
        foodandorgList.add(mealAndOrganisation);

    }

    public List<OrderingMealAndOrganisation> getFoodandorgList(){
        return foodandorgList;
    }

}

