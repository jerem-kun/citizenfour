package ArrayPractice;

public class Array {
    
    //FRQ PROBLEM
    double average = 0;
    int max = 0;
    int min = 100000;
    int[] itemsSold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
    double[] wages = new double[itemsSold.length];

    public double computeBonusThreshold(){
        for (int numberItems : itemsSold){
            average += numberItems;
            if (numberItems > max){
                max = numberItems;
            } 
            if (numberItems < min){
                min = numberItems;
            }      
        }

        average = average - max - min;
        average = average / (itemsSold.length-2);
        return average;
    }

    //FRQ PROBLEM
    public void computeWages(double fixedWage, double perItemWage){
        for (int i = 0; i < itemsSold.length; i++){
            double wage = fixedWage + (itemsSold[i] * perItemWage);
            if (itemsSold[i] > average){
                wage *= 1.1;
            }
            wages[i] = wage;
            System.out.println(wages[i]);
        }
        
    }
}
