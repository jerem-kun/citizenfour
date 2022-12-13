package FinalProject;
import java.util.Scanner;

public class Menu {

    private int typeInput;
    
    public void menuSSN(){
        System.out.println("[U.S. SOCIAL SECURITY NUMBER GENERATOR]");

        boolean valid = true;
        while (valid == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t 1. Create Random SSN");
            System.out.println("\t 2. Create State-Specific SSN");
            System.out.println("\nWhich would you like to generate?");
            typeInput = sc.nextInt();

            if (typeInput == 1) {
                //random
            } else if (typeInput == 2){
                //state
            } else {
                System.out.println("\nSYSTEM: Enter Valid Input\n");
            }
        }
    }
}
