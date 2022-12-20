package FinalProject;
import java.util.Scanner;

public class Menu {

    private String typeInput;
    RandomSSN random = new RandomSSN();
    SpecificSSN specific = new SpecificSSN();
    
    public void menuSSN(){
        //title
        System.out.println("\n[FREE SOCIAL SECURITY NUMBERS]");
        //loop to reprompt menu
        boolean menuValid = true;
        while (menuValid == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\t1. Create Random SSN");
            System.out.println("\t2. Create Location-Specific SSN");
            System.out.println("\t3. Exit");
            System.out.println("\nWhat would you like to generate?");
            typeInput = sc.nextLine();

            //TO DO:
            //create a conditional below that will compare the value of String typeInput to "1", "2", and "3"
            //have "1" run the following method: random.generateRandom()
            //have "2" run the following method: specific.generateSpecific()
            //have "3" switch the boolean menuValid to false
            //if the input is not "1", "2", or "3", print a statement to let the user know to enter one of the three

        }
    }
}

