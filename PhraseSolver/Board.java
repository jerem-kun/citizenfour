package PhraseSolver;
import java.util.Scanner;
import java.io.File;


//other classes: player (store name and score), spinner, score or amount, main (just to run game)
// use strings and .contains()

public class Board{

  private String loadPhrase(){
      String tempPhrase = "";
      
      int numOfLines = 0;
      tempPhrase = "how are you";
      
      try {
        
        Scanner sc = new Scanner(new File(/*Replace with the path*/"/workspace/citizenfour/PhraseSolver/phrases.txt"));
        while (sc.hasNextLine())
        {
          tempPhrase = sc.nextLine().trim();
          numOfLines++;
        }
      } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
      
      int randomInt = (int) ((Math.random() * numOfLines) + 1);
      
      try {
        int count = 0;
        Scanner sc = new Scanner(new File(/*Replace with the path*/"/workspace/citizenfour/PhraseSolver/phrases.txt"));
        while (sc.hasNextLine())
        {
          count++;
          String temp = sc.nextLine().trim();
          if (count == randomInt)
          {
            tempPhrase = temp;
          }
        }
      } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }

      return tempPhrase;
    
  }


Spinner wheelSpin = new Spinner();
Player playerRoster = new Player();

private String phrase;
private String phraseSpaces = "";
private String phraseBoard;
private String letterInput;
private String phraseGuess;
private String lettersGuessed = "";
private boolean currentPlayer;
private boolean turn;

//creates empty board to solve
public void loadBoard(){
  phrase = loadPhrase();
  //creates empty board
  phraseBoard = "";
  for(int i = 0; i < phrase.length(); i++){
    if(!phrase.substring(i, i+1).equals(" ")){
      phraseBoard += "_ "; 
    } else {
      phraseBoard += " "; 
    }
  } 
  //creates answer key for empty board
  for(int i = 0; i < phrase.length(); i++){
    if(!phrase.substring(i, i+1).equals(" ")){
      phraseSpaces += phrase.substring(i, i+1) + " ";
    } else {
      phraseSpaces += phrase.substring(i, i+1);
    }
  }
  phraseSpaces = phraseSpaces.substring(0, phraseSpaces.length()-1);
}

//method to loop player turn throughout game
public void playerTurn(Player p1, Player p2){
  boolean game = true;
  while(game){
    //sets player turn
    currentPlayer = playerRoster.alternateTurn();
    if (currentPlayer == true){
      System.out.println("\n" + p1.getPlayerName() + "'s TURN");
    } else {
      System.out.println("\n" + p2.getPlayerName() + "'s TURN");
    }

    //prompts player for what to do
    turn = true;
    while(turn == true){
      System.out.println("\n"+phraseBoard);
      System.out.println("\nWhat would you like to do? [1 or 2] ");
      System.out.println("\n\t1. Guess a Letter");
      System.out.println("\n\t2. Guess the Phrase");
      Scanner decision = new Scanner(System.in);
      String playerChoice = decision.nextLine();

      //guessing a letter
      if (playerChoice.equals("1")){
          //returns wheel value, adds to player score
          if (currentPlayer == true){
            p1.setPlayerScore(wheelSpin.spinRNG(), 1, p1, p2);
          } else if (currentPlayer == false){
            p2.setPlayerScore(wheelSpin.spinRNG(), 2, p1, p2);
          }
    
          boolean letterValid = true;
          while (letterValid == true){
            System.out.println("\nGUESS A LETTER: ");
            Scanner letter = new Scanner(System.in);
            letterInput = (letter.nextLine()).toLowerCase();
            //if letter not already guessed
            if (letterInput.length() == 1){
              if (!lettersGuessed.contains(letterInput)){
                //replaces blanks if letter in phrase
                if (phrase.contains(letterInput)){
                  for (int i = 0; i < phraseBoard.length(); i++){
                    int letterCorrect = phraseSpaces.indexOf(letterInput);
                    if (!(letterCorrect == -1)){
                      phraseSpaces = phraseSpaces.substring(0,letterCorrect) + "#" + phraseSpaces.substring(letterCorrect+1);
                      phraseBoard = phraseBoard.substring(0,letterCorrect) + letterInput + phraseBoard.substring(letterCorrect+1);
                    }
                  }
                //ends turn if letter not in phrase
                } else {
                  System.out.println("\nSorry, that is not in the phrase.\n");
                  System.out.println("\nEND TURN\n=================================\n");
                  turn = false;
                }
                lettersGuessed += letterInput;
                letterValid = false;
              //if letter already guessed
              } else {
                System.out.println("This letter has already been guessed.");
                letterValid = true;
              }
            } else {
              System.out.println("ENTER VALID LETTER");
            }
          }
        
      //guessing the phrase
      } else if (playerChoice.equals("2")){
          System.out.println("\nENTER PHRASE GUESS (all lower-case, with spaces): ");
          Scanner guess = new Scanner(System.in);
          phraseGuess = guess.nextLine();
          //determines game end/continue after phrase guess
          if (phraseGuess.equals(phrase)){
            game = false;
            turn = false;
            if (currentPlayer == true){
              System.out.println("\nCONGLATURATION " + p1.getPlayerName());
              System.out.println("\nYou Win $" + p1.getPlayerScore());
            } else {
              System.out.println("\nCONGLATURATION " + p2.getPlayerName());
              System.out.println("\nYou Win $" + p2.getPlayerScore());
            }
            System.out.println("\nEND GAME\n=================================");    
          } else {
            turn = false;
            System.out.println("\nSorry, that is not the correct phrase.\n");
            System.out.println("\nEND TURN\n=================================");
          }
      
      //failsafe for invalid input
      } else {
        System.out.println("\nPLEASE ENTER VALID INPUT\n");
      }  
    }
  }
}

}