package order_and_takeorder;

import com.ravzakoc.depot.OrderDepot;
import organisations.*;
import foodtypes.NormalFood;
import foodtypes.VeganFood;
import foodtypes.VegetarianFood;
import orderingtypes.OrderOrganisation;
import orderingtypes.OrderingFood;
import orderingtypes.OrderingMealAndOrganisation;

import java.util.Scanner;


public class Order {
    //Polimorfizmi burda kullandık sadece

    Scanner scanner= new Scanner(System.in);
    OrderDepot depot;

    public Order(){
        System.out.println("Enter your order type.");
        System.out.println("1- I want to order organisation ");
        System.out.println("2- I want to order food ");
        System.out.println("3- I want to order food and organisation ");
    }
    public void order(int orderType){ //overloading

        if (orderType ==1){
            scanner.nextLine();
            System.out.println("Your choice is been made as wanting an organisation.");

            System.out.println("Please choose your organisation type.");
            System.out.println("1- Birthday");
            System.out.println("2- Concept Party");
            System.out.println("3- Wedding");
            System.out.println("4-Kina");
            System.out.println("5-Graduation");

            int orgType = scanner.nextInt();

            //  Polimorfik Referansı Oluştur
            OrderOrganisation organisation = null;
            // burda poly amacına uygun kullanılmıştır organizasyon değişkeni ile tüm classlara erişim sağlanır


            if (orgType == 1) {
                organisation = new Birthday();
            } else if (orgType == 2) {
                organisation = new ConceptParty();
            } else if (orgType == 3) {
                organisation = new Wedding();
            } else if (orgType == 4) {
                organisation = new Kina();
            } else if (orgType == 5) {
                organisation = new Graduation();
            } else {
                System.out.println("Invalid organisation choice.");
                return;
            }

            // Metotları sadece BURADA çağır (Kod tekrarı bitti!)
            // Java, 'organisation' değişkeninin içinde hangi obje varsa (Kına mı, Doğumgünü mü) onu çalıştırır.
            organisation.accessories();
            organisation.numberOfPeople();
            organisation.waiterPreference();
            organisation.dj();
            organisation.choices();
            organisation.registration();
        }

        else if (orderType == 2) {
            System.out.println("Order food type: 1-Normal, 2-Vegetarian, 3-Vegan");
            int foodType = scanner.nextInt();

            //  Polimorfik Referans (Boş kutu)
            OrderingFood food = null;


            if (foodType == 1) {
                food = new NormalFood();
            } else if (foodType == 2) {
                food = new VegetarianFood();
            } else if (foodType == 3) {
                food = new VeganFood();
            } else {
                System.out.println("Invalid food choice.");
                return;
            }

            //  Metotları tek seferde çalıştır
            food.foodName();
            food.numberOfPeople();
            food.beverageChoice();
            food.dessertChoice();
            food.registration();
        }
        else if (orderType == 3) {
            OrderDepot depot = new OrderDepot();
            OrderingMealAndOrganisation order =
                    new OrderingMealAndOrganisation(depot);

            order.order();
            order.register();

        }

        else {
            System.out.println("Invalid main course choice.");
        }



    }
}