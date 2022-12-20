package FinalProject_KEY;

public class RandomSSN {
    
    private String finalRandomSSN = "";
    private int nextDigit;
    private int areaCode;
    private String correlatedState;
    AreaCodes areas = new AreaCodes();

    public RandomSSN(){
    }

    //randomly generates SSN, has to meet certain conditions/format
    public void generateRandom(){
        for(int i = 0; i < 9; i++){
            nextDigit = (int)(Math.random()*10);
            finalRandomSSN += nextDigit;
            if (finalRandomSSN.length() == 3){
                areaCode = Integer.valueOf(finalRandomSSN);
                //checks that area code is under 584 (the max for this program)
                if (areaCode > 584) {
                    i = 0;
                    finalRandomSSN = "";
                } else {
                    finalRandomSSN += "-";
                }
            } else if (finalRandomSSN.length() == 6){
                finalRandomSSN += "-";
            }
        }
        //prints generated SSN
        correlatedState = areas.giveState(areaCode);
        System.out.println("\nSOCIAL SECURITY NUMBER: " + finalRandomSSN);
        System.out.println("STATE: " + correlatedState + "\n");
    }
}


