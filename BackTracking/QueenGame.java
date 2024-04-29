package BackTracking;
import java.util.*;
// chase board 4 X 4 
// Queen remove player in 8 direction right left up down and diagonal
// 4 queen
// place quen 1st column 2nd queen in 2nd column and 3rd queen in 3rd column and 4th queen in 4th column
// in case any of the queen placing the other one not place we will go again to back in set the position again 
class Salution{
    public boolean isSafe(int row, int col, char[][] board){
        // horizental
        for(int j = 0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        // verticall
        for(int i = 0; i<board[0].length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // upper left
        int r = row;
        for(int c = col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // Upper right
        r = row;
        for(int c = col; c<board.length && r>=0; r--, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // Lower left
        r = row;
        for(int c = col; c>=0 && r<board.length; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // lower right
        r = row;
        for(int c = col; c<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public void helper(char[][] board, List<List<String>> allBoard,int col ){
        if(col == board.length){
            saveBoard(board, allBoard);
            return;
        }
        for(int row = 0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board , allBoard, col + 1);
                board[row][col] = '.';
            }
        }
    }
    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String>newBoard = new ArrayList<>();
        for(int i = 0; i<board.length; i++){
            row = "";
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }
                else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public List<List<String>> solveQueen (int n){
        List<List<String>>allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoard, 0);
        return allBoard;
    } 
}

public class QueenGame {
    
}
