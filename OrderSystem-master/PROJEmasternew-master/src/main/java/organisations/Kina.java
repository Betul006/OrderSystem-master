package organisations;

import com.ravzakoc.projectoop.Session;
import orderingtypes.OrderOrganisation;

import java.io.FileWriter;
import java.io.IOException;


public class Kina extends OrderOrganisation {
    public Kina(){
    }
    @Override
    public void accessories() {

        System.out.println("Please enter your name ");
        setName(scanner.nextLine());

        while (true) {
            System.out.println("Please choose a colour (red / blue / black / white / pink ):");
            String colour1  = scanner.nextLine().toLowerCase();

            if (colour1.equals("red") || colour1.equals("blue") ||
                    colour1.equals("black") || colour1.equals("white") ||
                    colour1.equals("pink")) {

                setColour(colour1);
                break; // doğru colour → döngüden çık
            } else {
                System.out.println("Wrong colour ! Choose another colour.");
            }
        }
    }

    @Override
    public void numberOfPeople() {

        while (true) {
            try {
                System.out.print("Enter how many people will come: ");
                int numberofpeople1 = scanner.nextInt();

                if (numberofpeople1 < 0) {
                    System.out.println("People who are coming can't be negative please enter again.");
                    continue; // döngünün başına dön
                }
                setNumberOfPeople(numberofpeople1);

                break; // doğru giriş → döngüden çık

            } catch (Exception e) {
                System.out.println("You entered something different from number please enter a number");
                scanner.nextLine();
            }
        }
    }

    @Override
    public void waiterPreference() {

        while (true) {
            System.out.println("Do you want a waitress? (yes / no )");
            boolean waiterPreference1 =scanner.nextBoolean();
            setName(scanner.nextLine());

            if (waiterPreference1) {


                while (true) {
                    System.out.print("Enter the number of waitress: ");
                    try {
                        int numberOfWaiters1 = Integer.parseInt(scanner.nextLine());

                        if (numberOfWaiters1 <= 0) {
                            System.out.println("Waitress number can't be a negative number or zero.");
                            continue;
                        }

                        System.out.println("Your waitress number is " + numberOfWaiters1 );
                        setNumberOfWaiters(numberOfWaiters1);
                        break; // iç döngüden çık
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                }
                setWaiterPreference(waiterPreference1);
                break; // ana döngüden çık
            }

            else if (waiterPreference1 == false) {
                System.out.println("You didn't choose a waitress.");
                setWaiterPreference(waiterPreference1);
                break; // ana döngüden çık
            }

            else {
                System.out.println("Wrong entry! Please write only yes or no .");
                setWaiterPreference(waiterPreference1);
            }
        }
    }
    @Override
    public void dj() {

        while (true) {
            System.out.println("Do you want a DJ? (yes / no)");
            boolean dj1=scanner.nextBoolean();


            if ( dj1 == true) {

                System.out.println("Your entry wanting a DJ is choosen .");
                setDj(dj1);
                break;
            }
            else if (dj1==false) {
                System.out.println("Your entry not wanting a DJ is choosen.");
                setDj(dj1);
                break;
            }
            else {
                System.out.println("Wrong entry! Please write only yes or no .");
                setDj(dj1);
            }
        }
    }

    @Override

    public void choices() {

        System.out.println("Your choices are down below:");

        System.out.println("Accessories : " + getColour());
        System.out.println("The number of people coming: " + getNumberOfPeople());

        if (getWaiterPreference()
        ) {
            System.out.println("Number of wanted waitress: " + getNumberOfWaiters());
        } else {
            System.out.println("You didn't want any waitresses.");
        }

        if (getdj()) {
            System.out.println("DJ wanted.");
        } else {
            System.out.println("DJ unwanted.");
        }

    }
    public void registration(){
        writeToFile();
        System.out.println("Your choices are written in the file");}

    public void writeToFile() {
        try {
            FileWriter fw = new FileWriter("PROJEmasternew-master/src/main/java/com/ravzakoc/file/order_organisations.txt", true);

            fw.write( "Email:" + Session.activeEmail +
                    "Kina | Colour: " + getColour() +
                    " | The Number Of People Coming: " + getNumberOfPeople() +
                    " | Waitress: " + (getWaiterPreference()
                    ? "Wanted (" + getNumberOfWaiters() + ")" : "Not Wanted") +
                    " | DJ: " + (getdj() ? "Wanted" : "Not Wanted") +" | "
            );

            fw.close();


        } catch (IOException e) {
            System.out.println("File entry not found "+ e.getMessage());
        }

    }

}
