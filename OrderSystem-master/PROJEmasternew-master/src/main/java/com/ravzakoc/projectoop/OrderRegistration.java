package com.ravzakoc.projectoop;

import com.ravzakoc.file.OrderCustomerFileManager;

import java.util.Scanner;

public class OrderRegistration implements RegisterScreen {

    private String email;
    private String password;
    private Long tc;
    private String address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        if (email.length() >= 3
                && email.contains("@")
                && email.contains(".")
                && !email.matches("\\d+")){
            this.email = email; // SADECE GEÇERLİYSE SET
        } else {
            System.out.println("Invalid email! (Must be at least 3 characters long and contain ‘@’ and ‘.’)");
            this.email = null;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        if (password.length() >= 3 && !password.matches("\\d+")) {
            this.password = password;
        } else {
            System.out.println("Invalid password! (Must be at least 3 characters long)");
            this.password = null;
        }
    }

    public Long gettc(){
        return tc;
    }

    public void setTc(long tc) {
        int tcDigitCount = String.valueOf(tc).length();
        if (tcDigitCount == 11 ) {
            this.tc = tc;
        } else {
            System.out.println("Invalid Turkish ID number! (Must be 11 digits long)");
            this.tc = null;
        }
    }

    public String getaddress(){
        return address;
    }

    public void setaddress (String address){
        if (address.length() >= 3 && !address.matches("\\d+")) {
            this.address = address;
        } else {
            System.out.println("Invalid address!");
            this.address = null;
        }
    }

    @Override
    public void register() {
        Scanner scanner = new Scanner(System.in);

        // EMAIL
        while (true) {
            System.out.print("Enter email: ");
            setEmail(scanner.nextLine());
            if (email != null) break;
        }

        // PASSWORD
        while (true) {
            System.out.print("Enter password: ");
            setPassword(scanner.nextLine());
            if (password != null) break;
        }

        // TC
        while (true) {
            System.out.print("Enter Turkish ID number: ");
            if (scanner.hasNextLong()) {
                setTc(scanner.nextLong());
                scanner.nextLine(); //  BUFFER TEMİZLEME
                if (tc != null) break;
            } else {
                System.out.println("Please enter numbers only");
                scanner.nextLine();
            }
        }

        // ADDRESS
        while (true) {
            System.out.print("Enter address: ");
            setaddress(scanner.nextLine());
            if (address != null) break;
        }

        // o an içinde bulunduğu kayıt objesi
        OrderMemory.customer.add(this);
        OrderCustomerFileManager.saveToFile(this);
        System.out.println("Registration successful. Redirecting to the login screen...");
        LoginScreen.login();

    }
}
