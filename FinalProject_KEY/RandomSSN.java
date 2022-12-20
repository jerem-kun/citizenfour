package FinalProject_KEY;

public class RandomSSN {
    
    private String finalRandomSSN = "";
    private int nextDigit;
    private int areaCode;
    private String correlatedState;
    AreaCodes areas = new AreaCodes();

    public RandomSSN(){
    }

    public void generateRandom(){
        for(int i = 0; i < 9; i++){
            nextDigit = (int)(Math.random()*10);
            finalRandomSSN += nextDigit;
            if (finalRandomSSN.length() == 3){
                areaCode = Integer.valueOf(finalRandomSSN);
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
        correlatedState = areas.giveState(areaCode);
        System.out.println("\nSOCIAL SECURITY NUMBER: " + finalRandomSSN);
        System.out.println("STATE: " + correlatedState + "\n");
    }
}

