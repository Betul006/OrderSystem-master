package com.ravzakoc;

import com.ravzakoc.projectoop.OrderLogin;
import order_and_takeorder.TakeOrder;
import com.ravzakoc.depot.OrderDepot;
import order_and_takeorder.Order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OrderDepot sharedStorage = new OrderDepot();

        System.out.println("Welcome! Please choose an option by entering its number.");
        System.out.println("1-I want to place an order.");
        System.out.println("2-I want to take orders.");

        int number = scanner.nextInt();
        if (number == 1) {
            //eğer sipariş vermek isterse giriş veya kayıt için bu classa yönlendirilir
           OrderLogin orderLogin= new OrderLogin();
           orderLogin.Orderlogin();


            Order sv = new Order();
            int orderType = scanner.nextInt();
            sv.order(orderType);

        } else if (number == 2) {
            System.out.println("You selected: Take orders.");
            OrderDepot depot = new OrderDepot();

            TakeOrder isTakingOrders = new TakeOrder(depot);

            isTakingOrders.ShowMenu();
            int select = scanner.nextInt();
            isTakingOrders.takeOrder1(select);

        } else {
            System.out.println("Invalid login");
            return;
        }




    }
}
