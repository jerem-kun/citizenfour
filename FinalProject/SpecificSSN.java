package FinalProject;
import java.util.Scanner;

public class SpecificSSN {

    private String stateInput = "";
    private String stateCode = "";
    private int nextDigit;
    private String finalSpecificSSN;
    AreaCodes areas = new AreaCodes();

    public SpecificSSN(){
    }
    
    public void generateSpecific(){
        Scanner sc = new Scanner(System.in);
        //loop to reprompt state input
        boolean stateValid = false;
        while (stateValid == false){
            System.out.println("\nGenerate SSN for which state? (include spaces)");
            stateInput = sc.nextLine().toUpperCase();
            stateCode = areas.giveNumber(stateInput);

            //randomly generates SSN based on area code provided for the specific state
            if (stateCode.equals("9999")){
                System.out.println("SYSTEM: Enter Valid Input");
            } else {
                stateValid = true;
                finalSpecificSSN = stateCode + "-";
                for (int i = 0; i < 5; i++){
                    nextDigit = (int)(Math.random()*10);
                    finalSpecificSSN += nextDigit;
                    //STEP 3: to properly format the SSN, a hyphen needs to occur after the 6th character (XXX-XX-XXXX)
                    //TO DO: create an if statement below that will check for the length of finalSpecificSSN and add a hyphen to the string when appropriate
                    
                }
            }          
        }

        System.out.println("\nSOCIAL SECURITY NUMBER: " + finalSpecificSSN);
        System.out.println("STATE: " + stateInput); 
    }
}
