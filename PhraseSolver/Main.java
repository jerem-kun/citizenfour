package PhraseSolver;

public class Main {
    
    public static void main(String args[]){
        
        Start startPrompt = new Start();
        Board displayBoard = new Board();
        Player player1 = new Player("", 0, 1);
        Player player2 = new Player("", 0, 2);

        //prompts game start
        boolean game = startPrompt.gameStart();

        //runs game
        if (game){
            player1.setPlayerName(player1.getPlayerID());
            player2.setPlayerName(player2.getPlayerID());
            displayBoard.loadBoard();
            displayBoard.playerTurn(player1, player2);
            }

        }



    }

