package ApnaCollegeDSA;

import java.util.Scanner;

class SolutionSudoku {
public boolean isSafe(char[][] board, int row, int col, int number) {
        //column
        for(int i=0; i<board.length; i++) {
        if(board[i][col] == (char)(number+'0')) {
        return false;
        }
        }

        //row
        for(int j=0; j<board.length; j++) {
        if(board[row][j] == (char)(number+'0')) {
        return false;
        }
        }

        //grid
        int sr = 3 * (row/3);
        int sc = 3 * (col/3);

        for(int i=sr; i<sr+3; i++) {
        for(int j=sc; j<sc+3; j++) {
        if(board[i][j] == (char)(number+'0')) {
        return false;
        }
        }
        }

        return true;
        }

public boolean helper(char[][] board, int row, int col) {
        if(row == board.length) {
        return true;
        }

        int nrow = 0;
        int ncol = 0;

        if(col == board.length-1) {
        nrow = row + 1;
        ncol = 0;
        } else {
        nrow = row;
        ncol = col + 1;
        }

        if(board[row][col] != '.') {
        if(helper(board, nrow, ncol)) {
        return true;
        }
        } else {

        //fill the place
        for(int i=1; i<=9; i++) {
        if(isSafe(board, row, col, i)) {
        board[row][col] = (char)(i+'0');
        if(helper(board, nrow, ncol))
        return true;
        else
        board[row][col] = '.';
        }
        }
        }

        return false;
        }

public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
        for (char[] c: board){
                System.out.println(c);
        }
        for (int i=0;i< board.length;i++){
                for (int j=0;j< board.length;j++){
                        System.out.print(board[i][j]+" ");
                }
                System.out.println();
        }
        }
        }


public class Video_21_SudokuSolver {
    public static void main(String[] args) {
        SolutionSudoku ss = new SolutionSudoku();

        char [][] board = {{'5','3','.','.','7','.','.','.','.'},
                           {'6','.','.','1','9','5','.','.','.'},
                           {'.','9','8','.','.','.','.','6','.'},
                           {'8','.','.','.','6','.','.','.','3'},
                           {'4','.','.','8','.','3','.','.','1'},
                           {'7','.','.','.','2','.','.','.','6'},
                           {'.','6','.','.','.','.','2','8','.'},
                           {'.','.','.','4','1','9','.','.','5'},
                           {'.','.','.','.','8','.','.','7','9'}};
        ss.solveSudoku(board);

            //        Scanner sc = new Scanner(System.in);
//        char[][] board = new char[9][9];
//        for (int i=0;i< board.length;i++){
//            for (int j=0;j< board.length;j++){
//                board[i][j]=sc.next().toCharArray();
//            }
//        }
//        for (int i=0;i< board.length;i++){
//            for (int j=0;j< board.length;j++){
//                System.out.println(board[i][j]);
//
//            }
//        }
//        ss.solveSudoku();
    }
}
// below solution is also ok but time complexity jada lagega bahut jada as compare above solution
/*

class Sudoku{
  public boolean isSafe(char[][] board,int row,int col,int num){
    //row
    for (int i=0;i< board.length;i++){
      if (board[i][col]==(char)(num+'0')){
        return false;
      }
    }
    //col
    for (int i=0;i< board.length;i++){
      if (board[row][i]==(char)(num+'0')){
        return false;
      }
    }
    //grid
    int sr = (row/3)*3;
    int sc = (col/3)*3;
    for (int i=sr;i<sr+3;i++){
      for (int j=sc;j<sc+3;j++){
        if (board[i][j]==(char)(num+'0')){
          return false;
        }
      }
    }
    return true;
  }
  public void saveSudoku(char[][] board,char[][] board2){
//board2[row][col]=board[row][col];
    for (int i=0;i< board.length;i++){
      for (int j=0;j< board.length;j++){
        board2[i][j]=board[i][j];
      }
    }
    for (int i=0;i< board2.length;i++){
      for (int j=0;j< board2.length;j++){
        System.out.print(board2[i][j]+" ");
      }
      System.out.println();
    }
    for (char[] c:board2){
      System.out.println(c);
    }
  }
  public void helper(char[][] board,int row,int col,char[][] board2){
    if (row==board.length){
saveSudoku(board,board2);
      return;
    }
    int nrow=0;
    int ncol=0;
    if (col==board.length-1){
      nrow=row+1;
      ncol=0;
    }else {
      nrow=row;
      ncol=col+1;
    }
    if (board[row][col]!='.'){
      helper(board,nrow,ncol,board2);
    }else {
      for (int i=1;i<=9;i++){
        if (isSafe(board,row,col,i)){
          board[row][col]=(char)(i+'0');
          helper(board,nrow,ncol,board2);
          board[row][col]='.';
        }
      }
    }
  }
  public void solveSudoku(char[][] board){
char [][] board2 = new char[9][9];
    helper(board,0,0,board2);
for (char[] c :board){
  System.out.println(c);
}
  }

}
public class Practice {

  public static void main(String[] args) {
    Sudoku ss = new Sudoku();

    char [][] board = {{'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}};
    ss.solveSudoku(board);

  }
}
 */