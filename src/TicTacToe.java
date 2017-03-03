import java.util.Scanner;

public class TicTacToe {
	static Boolean p1Turn;
	static char[][] board = new char[3][3];
	static String again = "y";

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(again.charAt(0) == 'y'){
			initGame();
			printSpaces();
			while(gameNotWon()){
					int move;
					char token;
					do{
						if(p1Turn){
							token = 'X';
							System.out.printf("Player 1's move: ");
						}else {
							token = 'O';
							System.out.printf("Player 2's move: ");
						}
						move = in.nextInt();
					}while(placeMove(token, move));
					p1Turn = !p1Turn;
					printBoard();
				}
			if(p1Turn){
				System.out.printf("Player 1 won!\n");
			}else{
				System.out.printf("Player 2 won!\n");
			}
			System.out.printf("Play again [y/n]? ");
			again = in.next();
		}
		in.close();
	}
	
	private static void initGame(){
		p1Turn = true;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				board[i][j] = ' ';
			}
		}
	}
	
	private static void printSpaces(){
		System.out.printf(" 0 | 1 | 2 \n 3 | 4 | 5 \n 6 | 7 | 8 \n");
	}
	
	private static void printBoard() {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				System.out.printf("%c | ", board[i][j]);
			}
			System.out.printf("%c\n", board[i][2]);
		}
	}

	private static Boolean placeMove(char marker, int move){
		if(move > 8){
			System.out.printf("Please place a correct move!\n");
			printSpaces();
			return true;
		}
		if(board[move / 3][move % 3] == ' '){
			board[move / 3][move % 3] = marker;
			return false;
		} else {
			System.out.printf("Space already take!\n");
			return true;
		}
	}

	private static boolean gameNotWon() {
		for(int i = 0; i < 3; i++){
			if(board[i][0] != ' '){
				if(board[i][0] == board[i][1] && board[i][0] == board[i][2]){
					return false;
				}
			}
			if(board[0][i] != ' '){
				if(board[0][i] == board[1][i] && board[0][i] == board[2][i]){
					return false;
				}
			}
		}
		if(board[1][1] != ' '){
			if(board[0][0] == board[1][1] && board[0][0] == board[2][2]){
				return false;
			}
			if(board[2][0] == board[1][1] && board[2][0] == board[0][2]){
				return false;
			}
		}
		return true;
	}
}
