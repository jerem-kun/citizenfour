package LoopPractice;

public class Main {
    
    public static void main(String[] args){
        
        String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";

		System.out.println("The following shows the letter frequencies for the phrase");

        /* your code here */
    
        int count = 0;
        for(int i = 0; i < letters.length(); i++){
            String currentAlphLetter = letters.substring(i,i+1);
            
            for(int y = 0; y < phrase.length(); y++){
                System.out.println(phrase.length());
                System.out.println(y);
                String currentPhraLetter = phrase.substring(i,i+1);
                
                if (currentAlphLetter.equals(currentPhraLetter)){
                    count += 1;
                }
                
            }
            System.out.println(currentAlphLetter.toUpperCase() + ": " + count);
            count = 0;
        }
    }

}
