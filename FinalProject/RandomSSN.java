package FinalProject;

public class RandomSSN {
    
    private String finalRandomSSN = "";
    private int nextDigit;
    private int areaCode;
    private String correlatedState;
    AreaCodes areas = new AreaCodes();

    public RandomSSN(){
    }

    //randomly generates SSN
    public void generateRandom(){ 
        for(int i = 0; i < 9; i++){
            nextDigit = (int)(Math.random()*10);
            finalRandomSSN += nextDigit;
            //STEP 5: TO DO: create conditionals that will check the area code (first 3 numbers) of the finalRandomSSN string
            //if the area code is over 584, set i = 0 and finalRandomSSN = "", otherwise add a hyphen to the string
            //create a conditional that will check for the length of finalRandomSSN and add a hyphen to the string after the 6th character
        }
        correlatedState = areas.giveState(areaCode);
        System.out.println("\nSOCIAL SECURITY NUMBER: " + finalRandomSSN);
        System.out.println("STATE: " + correlatedState + "\n");
    }
}


