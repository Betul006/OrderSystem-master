package com.ravzakoc.projectoop;

import com.ravzakoc.file.OrderCustomerFileManager;

import java.util.Scanner;

public class OrderLogin {
    public OrderLogin(){

    }
    Scanner scanner = new Scanner(System.in);
    public void Orderlogin(){
    System.out.println("Your selection has been received as placing an order.");
            System.out.println("If you are not registered, please sign up on the registration screen. If you already have an account, please go to the login screen.");
            System.out.println("1-Register Screen");
            System.out.println("2-Login Screen");
    int register = scanner.nextInt();
            if (register == 1) {
        OrderRegistration register1 = new OrderRegistration();
        register1.register();

    } else if (register == 2) {
        LoginScreen loginScreen = new LoginScreen();
        OrderCustomerFileManager.dowloadFromFile();
        loginScreen.login();

    } else {
        System.out.println("invalid login");
        return;
    }
    }
}
