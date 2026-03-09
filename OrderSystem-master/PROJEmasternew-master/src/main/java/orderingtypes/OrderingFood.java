package orderingtypes;


public abstract class OrderingFood {
    // normal yemek, vejeteryan yemek, vegan yemek
    //methodlar (yemek adı, kişi sayısı,  ister misiniz ve adı , tatlı ister misiniz ve adı)
    private String food;
    private int numberOfPeople;
    private boolean beveragePreference;
    private String drink;
    private boolean dessertPreference;
    private String dessert;


    public String getFood(){
     return food;
    }
    public void setFood(String food){
     this.food = food;
    }
    
    public int getNumberOfPeople(){
     return numberOfPeople;
    }
    public void setNumberOfPeople(int numberOfPeople){
     this.numberOfPeople = numberOfPeople;
    }
    
    public boolean getBeveragePreference(){
     return beveragePreference;
    }
    public void setBeveragePreference(boolean beveragePreference){
     this.beveragePreference = beveragePreference;
    }

    public String getDrink(){
        return drink;
    }
    public void setDrink(String drink){
        this.drink=drink;
    }

    public boolean getDessertPreference(){
        return dessertPreference;
    }
    public void setDessertPreference(boolean dessertPreference){
        this.dessertPreference=dessertPreference;
    }

    public String getDessert(){
        return dessert;
    }
    public void setDessert(String dessert){
        this.dessert=dessert;
    }


     public abstract void foodName();
     public abstract void numberOfPeople();
     public abstract void beverageChoice();
     public abstract void dessertChoice();
     public abstract void writingToFoodFile();
     public abstract void registration();

}
