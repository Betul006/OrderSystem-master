package com.ravzakoc.projectoop;

import order_and_takeorder.Order;

import java.util.Scanner;

public class OrganisationCompany extends Order {

    Scanner scanner= new Scanner(System.in);
    String companyName;
    String companyEmail;
    int numberOfEmployees;
    String companyAddress;
    double taxNumber;

    public OrganisationCompany(){
        System.out.println("Please register your organization company in the system; otherwise, you will not be able to accept orders.");
    }

    public void companyDetails(){
        companyName=scanner.nextLine();
        companyEmail= scanner.nextLine();
        numberOfEmployees= scanner.nextInt();
        companyAddress = scanner.nextLine();
        taxNumber= scanner.nextDouble();



    }
    public void output(){
        System.out.println("Your company registration is been made.");
        System.out.println();
    }
}