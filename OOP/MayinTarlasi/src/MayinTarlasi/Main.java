package MayinTarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int row, column;
		System.out.println("May�n tarlas�na ho�geldiniz!");
		System.out.println("L�tfen oynamak istedi�iniz boyutlar� giriniz:");
//		System.out.println("Sat�r say�s�: ");
//		row = input.nextInt();
//		System.out.print("S�tun say�s�: ");
//		column = input.nextInt();
		
		
		
		MayinTarlasi mayin= new MayinTarlasi(2,2 );
		mayin.run();

	}

}

