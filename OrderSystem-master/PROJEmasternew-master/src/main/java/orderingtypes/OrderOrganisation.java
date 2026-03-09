package orderingtypes;

import java.util.Scanner;

public abstract class OrderOrganisation {

    public Scanner scanner = new Scanner(System.in);
    private String colour;
    private int numberOfPeople;
    private boolean waiterPreference;
    private int numberOfWaiters;
    private boolean dj;
    private String name;


    public String getColour() {

        return colour;
    }

    public void setColour(String colour){

        this.colour=colour;
    }

    public int getNumberOfPeople(){
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople){
        this.numberOfPeople = numberOfPeople;

    }
    public int getNumberOfWaiters(){
        return numberOfWaiters;
    }
    public void setNumberOfWaiters(int numberOfWaiters){
        this.numberOfWaiters = numberOfWaiters;
    }
    public boolean getWaiterPreference(){
        return waiterPreference;
    }
    public void setWaiterPreference(boolean waiterPreference){
        this.waiterPreference = waiterPreference;
    }
    public boolean getdj(){
        return dj;
    }
    public void setDj(boolean dj){
        this.dj=dj;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    // nesne oluşturmaz sadece alt sınıflara temel sağlar
// konsept parti, doğum günü , nişan ve türleri ,
    public abstract void accessories();
    public abstract void numberOfPeople();
    public abstract void waiterPreference();
    public abstract void dj();
    public abstract void choices();
    public abstract void writeToFile();
    public abstract void registration();
// bu class abstract classdır


}