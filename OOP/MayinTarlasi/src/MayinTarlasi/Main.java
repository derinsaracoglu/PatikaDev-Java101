package MayinTarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int row, column;
		System.out.println("Mayýn tarlasýna hoþgeldiniz!");
		System.out.println("Lütfen oynamak istediðiniz boyutlarý giriniz:");
//		System.out.println("Satýr sayýsý: ");
//		row = input.nextInt();
//		System.out.print("Sütun sayýsý: ");
//		column = input.nextInt();
		
		
		
		MayinTarlasi mayin= new MayinTarlasi(2,2 );
		mayin.run();

	}

}

