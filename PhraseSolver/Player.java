package PhraseSolver;
import java.util.Scanner;

public class Player {
    
    private String playerName;
    private int playerScore;
    private int playerID;
    private boolean currentPlayer = true;

    //constructors
    public Player(){
        playerName = "";
        playerScore = 0;
        playerID = 0;
    }

    public Player(String name, int score, int id){
        playerName = name;
        playerScore = score;
        playerID = id;
    }

    //getters
    public int getPlayerID(){
        return playerID;
    }

    public String getPlayerName(){
        return playerName;
    }

    public int getPlayerScore(){
        return playerScore;
    }

    //changes player turn
    public boolean alternateTurn(){
        if (currentPlayer == true){
            currentPlayer = false;
            return false;
        } else {
            currentPlayer = true;
            return true;
        }
    }

    //setters
    public void setPlayerName(int id){
        if (id == 1){
            System.out.println("Enter Player 1 Name: ");
        } else if (id == 2){
            System.out.println("Enter Player 2 Name: ");
        }
        Scanner sc = new Scanner(System.in);
        String nameInput = sc.nextLine();
        playerName = nameInput;
    }

     public void setPlayerScore(int rng, int id, Player p1, Player p2){
        if (rng == 0){
            playerScore = rng;
        } else {
            playerScore += rng;
        }
        if (id == 1){
            System.out.println(p1.getPlayerName() + "'s Score: $" + p1.getPlayerScore());
        } else if (id == 2){
            System.out.println(p2.getPlayerName() + "'s Score: $" + p2.getPlayerScore());
        }
    }
}   