package FinalProject_KEY;
import java.util.Scanner;

public class Menu {

    private String typeInput;
    RandomSSN random = new RandomSSN();
    SpecificSSN specific = new SpecificSSN();
    
    public void menuSSN(){
        System.out.println("\n[FREE SOCIAL SECURITY NUMBERS]");

        boolean menuValid = true;
        while (menuValid == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\t1. Create Random SSN");
            System.out.println("\t2. Create Location-Specific SSN");
            System.out.println("\t3. Exit");
            System.out.println("\nWhat would you like to generate?");
            typeInput = sc.nextLine();

            if (typeInput.equals("1")) {
                random.generateRandom();
            } else if (typeInput.equals("2")){
                specific.generateSpecific();
            } else if (typeInput.equals("3")){
                menuValid = false;
                System.out.println("\nSYSTEM: See you space cowboy...");
            } else {
                System.out.println("\nSYSTEM: Enter Valid Input\n");
            }
        }
    }
}

