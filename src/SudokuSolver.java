public class SudokuSolver {
    private static final int GRID_SIZE = 9;
    public static void main(String[] args) {
        int[][] board = {
                {1,0,5,0,7,6,0,0,0},
                {0,7,2,0,0,0,0,5,0},
                {0,0,0,2,5,8,7,6,0},
                {0,5,9,0,0,0,3,4,0},
                {0,2,6,0,3,5,0,0,0},
                {0,1,3,0,0,0,6,7,5},
                {5,3,8,6,1,0,0,9,0},
                {2,6,1,0,9,0,0,8,7},
                {0,4,0,5,0,0,0,3,0}
        };
    }
    private static boolean isNumberInRow(int[][] board, int number, int row){
        for(int i  = 0 ; i <GRID_SIZE; i++){
            if(board[row][i] == number){
                return true;
            }
        }
        return false;
    }
}
