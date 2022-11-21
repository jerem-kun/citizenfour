package PhraseSolver;
import java.util.Scanner;

public class Start {
    
    private boolean game;
    private boolean startError = true;

    public boolean gameStart(){  
        //title
        System.out.println("\n[PHRASE SOLVER]\n");

        //game start prompt
        while (startError){
            System.out.print("Ready Players? (Y/N) ");
            Scanner sc = new Scanner(System.in);
            String start = sc.nextLine();
            //determines whether game starts or not based on user input
            if (start.toUpperCase().equals("Y")){
                game = true;
                startError = false;
            } else if (start.toUpperCase().equals("N")){
                game = false;
                startError = false;
                System.out.println("\n'A strange game. The only winning move is not to play.'");
            } else {
                System.out.println("\nPLEASE ENTER VALID INPUT\n");
            }   
        }   
        return game;
    }
}
