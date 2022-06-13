package TemelAlgoritma;

import java.util.Scanner;

public class etkinlikDuzenleyici {

	public static void main(String[] args) {
		
		int derece = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sicakligi giriniz:" );
		derece = input.nextInt();
		
		if(derece<5) {
			System.out.println("Kayak yapabilirsiniz.");
		}
		else if(5>=derece && derece<15) {
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		else if(15>=derece && derece<25) {
			System.out.println("Piknik yapabilirsiniz.");
		}
		else if(25>=derece) {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
		else {
			System.out.println("...");
		}

	}

}
