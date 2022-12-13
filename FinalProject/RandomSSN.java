package FinalProject;

public class RandomSSN {
    
    private String finalRandomSSN = "";
    private int nextDigit;

    public RandomSSN(){

    }

    public void createRandom(){
        for(int i = 0; i <= 9; i++){
            nextDigit = (int)(Math.random()*10);
            finalRandomSSN += nextDigit;
            if (finalRandomSSN.length() == 3){
                finalRandomSSN += "-";
            } else if (finalRandomSSN.length() == 6){
                finalRandomSSN += "-";
            }
        }
    }
}


