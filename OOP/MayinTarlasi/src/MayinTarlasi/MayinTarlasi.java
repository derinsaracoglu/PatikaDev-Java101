package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
	int rowNumber,colNumber,size,success=0;
	int[][]map;
	int[][]board;
	boolean game = true;
	
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	
	MayinTarlasi(int rowNumber,int colNumber){
		this.rowNumber= rowNumber;
		this.colNumber= colNumber;
		this.map = new int[rowNumber][colNumber];
		this.board = new int[rowNumber][colNumber];
		this.size = rowNumber*colNumber;
	}
	
	public void run() {
		int row,col,success=0;;
		prepareGame();
		print(map);
		System.out.println("Oyun baþladý !");
		while(game) {
			print(board);
			System.out.print("Satýr :");
			row = input.nextInt();
			System.out.print("Sütun :");
			col = input.nextInt();
			if(map[row][col] != -1) {
				if(success == (size-(size/4))) {
					System.out.println("Baþarýlý...Oyunu bitirdiniz !");
					break;
				}
				check(row,col);
				success++;
			}
			else {
				game = false;
				System.out.println("Oyun bitti.");
			
			}
			
		}
	}
	
	public void check(int r,int c) {
		
		//Seçilen sayý köþede ise diðer taraflara bakmamayý saðlar.Örneðin [0][0] gibi..
		//Seçilen yerlerde mayýn olup olmadýðýný kontrol eder.
		
		if((c<colNumber-1) && (map[r][c+1]) == -1) {
			board[r][c]++;
		}
		
		if((r<rowNumber -1) && (map[r+1][c]) == -1) {
			board[r][c]++;
		}
		
		if((r<rowNumber+1) && (map[r-1][c]) == -1) {
			board[r][c]++;
		}
		
		if((c<colNumber+1) && (map[r][c-1]) == -1) {
			board[r][c]++;
		}
		
		if(board[r][c] == 0) {
			board[r][c] = -2;
		}
		
	}
	
	public void prepareGame() {
		int randRow,randCol,count =0;
		while(count != (size/4)) {
			randRow = rand.nextInt(rowNumber);
			randCol = rand.nextInt(colNumber);
			if(map[randRow][randCol]!= -1) {
				map[randRow][randCol] = -1;
				count++;
			}
		}
	}
	
	public void print(int[][] _arr) {
		for(int i = 0; i<_arr.length; i++) {
			for(int j = 0; j<_arr[0].length; j++) {
				System.out.print(_arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}
}