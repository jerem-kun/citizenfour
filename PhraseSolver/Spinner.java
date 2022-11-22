package PhraseSolver;

public class Spinner {

    private int spinResult;
    private int RNG; 

    public Spinner(){
        spinResult = 0;
        RNG = 0;
    }
    
    public int spinRNG(){ 
        //bankruptcy chance
        RNG = (int) (Math.random()*16);
        if (RNG <= 1){
            System.out.println("\nWheel Spin Result: BANKRUPT");
            return 0; 
        //RNG score result 100-900, increments of 100
        } else {
            spinResult = (int) (Math.random()*900);
            spinResult = ((spinResult+99)/100)*100;
            System.out.println("\nWheel Spin Result: $" + spinResult);
            return spinResult;
        }
    }

}
