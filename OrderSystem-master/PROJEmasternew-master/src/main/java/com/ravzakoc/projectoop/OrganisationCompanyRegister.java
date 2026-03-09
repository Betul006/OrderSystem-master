package com.ravzakoc.projectoop;

import com.ravzakoc.file.OrganisationCompanyFileManager;

import java.util.Scanner;

public class OrganisationCompanyRegister implements RegisterScreen {

    Scanner scanner = new Scanner(System.in);

    private String companyName;
    private String companyEmail;
    private int numberOfEmployees;
    private String companyAddress;
    private long taxNumber;
    private String password;

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;   // burada direkt atadım
    }

    public String getCompanyEmail(){
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail){

        while(true){
            if(companyEmail.length() >= 3
                    && companyEmail.contains("@")
                    && companyEmail.contains(".")
                    && !companyEmail.matches("\\d+")){

                this.companyEmail = companyEmail;
                break;

            }else{
                System.out.println("Invalid email! (Write with atleast 3 character and use @ and .)");
                System.out.print("Enter email : ");
                companyEmail = scanner.nextLine();
            }
        }
    }

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees){

        while(true){
            if(numberOfEmployees > 0){
                this.numberOfEmployees = numberOfEmployees;
                break;
            }
            else{
                System.out.println("Insufficient number of employees");
                numberOfEmployees = scanner.nextInt();
            }
        }
    }

    public String getCompanyAddress(){
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress){
        this.companyAddress = companyAddress;
    }

    public long getTaxNumber(){
        return taxNumber;
    }

    public void setTaxNumber(long taxNumber){

        while(true){
            if(String.valueOf(taxNumber).length() == 10){
                this.taxNumber = taxNumber;
                break;
            }
            else{
                System.out.println("Invalid tax number ");
                System.out.print("Enter tax number (It needs to include at least 3 characters): ");
                taxNumber = scanner.nextLong();
            }
        }
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){

        while(true){
            if(password.length() >= 3 && !password.matches("\\d+")){
                this.password = password;
                break;
            }
            else{
                System.out.println("Invalid password!Write with at least 3 characters.It can't be just numbers.");
                System.out.print("Enter password: ");
                password = scanner.nextLine();
            }
        }
    }

    public void register(){

        System.out.println("Company name:  ");
        setCompanyName(scanner.nextLine());

        System.out.print("Enter Company Email: ");
        setCompanyEmail(scanner.nextLine());

        System.out.println("Write with at least 3 characters.");
        System.out.print("Enter password: ");
        setPassword(scanner.nextLine());

        System.out.println("Enter company address");
        setCompanyAddress(scanner.nextLine());

        System.out.println("Enter the number of employees in your company.");
        setNumberOfEmployees(scanner.nextInt());

        System.out.println("Enter the tax number (must be 10 characters):");
        setTaxNumber(scanner.nextLong());


        OrganisationCompanyMemory.company.add(this);
        OrganisationCompanyFileManager.saveToFile(); // 💾 KAYDET

        System.out.println("Company registration successful.");
        System.out.println("Redirecting to the login screen...");

        LoginScreen.login();


    }
}
