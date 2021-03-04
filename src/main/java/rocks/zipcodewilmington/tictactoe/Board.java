package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] gameBoard;
    public Board(Character[][] matrix) {
     this.gameBoard=matrix;
    }

    public Boolean isInFavorOfX() {
        if((gameBoard[0][1]==gameBoard[1][1])&&(gameBoard[0][1]==gameBoard[2][1])){
            return true;}
        else {return false;}
  }

    public Boolean isInFavorOfO() {
        if((gameBoard[0][1]==gameBoard[1][1])&&(gameBoard[0][1]==gameBoard[2][1])){
        return true;}
        else {return false;}
    }

    public Boolean isTie() {
        Boolean flag=false;
        if((gameBoard[0][0]==gameBoard[0][2]) ==( gameBoard[0][2] == gameBoard[2][0])){
         flag=true;}
        else {flag=false;}
        return flag;
    }

    public String getWinner() {
        for (int x=0; x< gameBoard.length; x++){
            if((gameBoard[0][1]==gameBoard[1][1])&&(gameBoard[0][1]==gameBoard[2][1])){ return "Winner O";}
        else if((gameBoard[0][1]==gameBoard[1][1])&&(gameBoard[0][1]==gameBoard[2][1])) {return "Winner X";}
        else {
                return "its tie";
            }
        }
        return "null";
    }
    }



