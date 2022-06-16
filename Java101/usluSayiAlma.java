package TemelAlgoritma;

import java.util.Scanner;

public class usluSayiAlma {

	static int power(int base, int exp) {
		Scanner input = new Scanner(System.in);

		if (exp == 1) {
			return base;
		}
		if (exp == 0) {
			return 1;
		}

		return power(base, exp - 1) * power(base, 1);

	}

	public static void main(String[] args) {
		 int base,exp;
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Taban : ");
	        base = scan.nextInt();
	        System.out.print("Üs : ");
	        exp = scan.nextInt();

	        System.out.println("Sonuc: " + power(base,exp));
	    }
	}
