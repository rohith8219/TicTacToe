public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Initialize the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        System.out.println("Empty Tic-Tac-Toe Board:");
        
        // Print the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Print the character followed by a space
                System.out.print(board[i][j] + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}