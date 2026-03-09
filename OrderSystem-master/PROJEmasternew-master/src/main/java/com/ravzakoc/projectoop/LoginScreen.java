package com.ravzakoc.projectoop;

import java.util.Scanner;

public class LoginScreen {

    public static void login() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Redirected to the login screen");

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();



            // MÜŞTERİ (Sipariş Veren)
            for (OrderRegistration sv : OrderMemory.customer) { // for-each
                if (sv.getEmail().equals(email) && sv.getPassword().equals(password)) {
                    System.out.println("Customer login successful");

                    Session.activeEmail = sv.getEmail();
                    return;
                }

            }

            // SİPARİŞ ALAN (Organizasyon Alan Kişi)
            for (TakeOrderRegister sa : TakeOrderMemory.organisations) {
                if (sa.getEmail().equals(email) && sa.getPassword().equals(password)) {
                    System.out.println("Order taker login successful");
                    Session.activeEmail = sa.getEmail();
                    return;
                }

            }

            // ORGANİZASYON ŞİRKETİ
            for (OrganisationCompanyRegister os : OrganisationCompanyMemory.company) {
                if (os.getCompanyEmail().equals(email) && os.getPassword().equals(password)) {
                    System.out.println("Organization login successful");

                    Session.activeEmail = os.getCompanyEmail();
                    return;
                }
            }



        }
    }
}
