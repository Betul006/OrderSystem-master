package foodtypes;

import com.ravzakoc.projectoop.Session;
import orderingtypes.OrderingFood;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NormalFood extends OrderingFood {
public NormalFood(){

}
    public Scanner scanner =new Scanner(System.in);


    @Override
    public void foodName() {

        System.out.println("Choose your food type ( keskek / chicken and rice  / sarma / kebab / soup):");
        String food1 = scanner.nextLine().toLowerCase();
        while (true) {
            if (food1.equals("keskek") || food1.equals("chicken and rice") ||
                    food1.equals("sarma") || food1.equals("kebab") ||
                    food1.equals("soup")) {

                setFood(food1);
                System.out.println("Your choice is been made.");
                break;

            } else {
                System.out.println("Wrong food choice. Choose again:");
                food1 = scanner.nextLine().toLowerCase();
            }
        }
    }

    public void numberOfPeople() {

        while (true) {
            try {
                System.out.print("Write the number of people: ");
                int numberOfPeople1 = scanner.nextInt();

                if (numberOfPeople1 < 0) {
                    System.out.println("Number of people can't be negative. Write it again.");
                    continue; // döngünün başına dön
                }
                setNumberOfPeople(numberOfPeople1);
                break; // doğru giriş → döngüden çık

            } catch (Exception e) {
                System.out.println("You wrote something other than number.Write it again.");
                scanner.nextLine(); // hatalı input'u temizle
            }


        }

    }

    @Override
    public void beverageChoice() {

        while (true) {
            try {
                System.out.println("Do you want to drink something? Choose true or false");
                boolean BeveragePreference = scanner.nextBoolean();
                setBeveragePreference(BeveragePreference);
                scanner.nextLine();

                if (BeveragePreference) {
                    while (true) {
                        System.out.println("Choose your drink from here (cola / fanta / orange juice / sprite / lemonade)");
                        String drink1 = scanner.nextLine().toLowerCase();

                        if (drink1.equals("cola") || drink1.equals("fanta") ||
                                drink1.equals("orange juice") || drink1.equals("sprite") ||
                                drink1.equals("lemonade")) {
                            setDrink(drink1);
                            System.out.println("Your choice is been made.");
                            break;
                            // drink1 döngüsünden çık
                        } else {
                            System.out.println("Invalid choice.Please choose again.");
                        }

                    }
                } else {
                    System.out.println("Your  beverage choice is been made as not wanted. ");
                }

                break; // ANA while'dan çık

            } catch (Exception e) {
                System.out.println("Please just write true or false !");
                scanner.nextLine(); // hatalı girişi temizle
            }
        }
    }


    @Override
    public void dessertChoice() {

        while (true) {
            try {
                System.out.println("Do you want dessert .Please write true or false:");
                boolean dessertPreference = scanner.nextBoolean();
                setDessertPreference(dessertPreference);
                scanner.nextLine();

                if (dessertPreference) {
                    while (true) {
                        System.out.println("Choose dessert ( creampuff / cake / tiramisu / spoonful )");
                        String dessert1 = scanner.nextLine().toLowerCase();
                        if (dessert1.equals("creampuff") || dessert1.equals("cake") ||
                                dessert1.equals("tiramisu") || dessert1.equals("spoonful")) {

                            setDessert(dessert1);
                            System.out.println("Your dessert choice is been made.");
                            break;
                        } else {
                            System.out.println("Invalid choice.Please choose again.");
                        }

                    }
                } else {
                    System.out.println("Your dessert choice is been made as not wanted.");
                }

                break; // ANA while'dan çık

            } catch (Exception e) {
                System.out.println("Please just write true or false!");
                scanner.nextLine(); // hatalı girişi temizle
            }
        }

    }
    public void registration(){
        System.out.println("Your choices are been made .They are been written in file. ");
        writingToFoodFile();
    }
    public void writingToFoodFile() {


            try {
                FileWriter fw = new FileWriter("PROJEmasternew-master/src/main/java/com/ravzakoc/file/order_food.txt", true);
                fw.write(
                        " Email: " + Session.activeEmail +
                                " Normal Food | " +
                                "Food: " + getFood() +
                                " | Number of people: " + getNumberOfPeople() +
                                " | Beverage: " + (getBeveragePreference() ? getDrink() : "Not choosen") +
                                " | Dessert: " + (getDessertPreference() ? getDessert() : "Not choosen") +"\n"
                );

                fw.close();
                System.out.println("Your food choices are written in file.");


            } catch (IOException e) {
                System.out.println("Food file writing error."+e.getMessage());
            }



    }

}
