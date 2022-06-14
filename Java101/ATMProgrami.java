package TemelAlgoritma;

import java.util.Scanner;

public class ATMProgrami {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String id = "deron";
		String pass = "deron123";
		int right = 3;
		int price;
		int balance = 1500;
		int select;

		while (right > 0) {
			System.out.print("Kullan�c� Ad�n�z :");
			String userName = input.nextLine();

			// Kullanici teyit

			while (!(userName.equals(id))) {

				System.out.println("Kullan�c� ad�n�z yanl��.L�tfen tekrar deneyiniz.");
				String a = input.nextLine();
				if (a.equals(id)) {
					break;
				}
			}
			System.out.println("Sifrenizi giriniz :");
			String password = input.nextLine();
			String b = "";
			while (!(password.equals(pass))) {

				System.out.println("Hatal� �ifre girdiniz. Kalan hakk�n�z : " + right);
				password = input.nextLine();
				right--;

				if (right == 0) {
					System.out.println("hesab�n�z bloke olmu�tur");
					return;
				}
			}

			// Para yatirma-cekme i�lemleri

			System.out.println("L�tfen yapaca��n�z i�lemi se�in:\n" + "1.Para Yatirma\n" + "2.Para �ekme\n"
					+ "3.Bakiye Sorgula\n" + "4.��k�� Yap");
			select = input.nextInt();

			switch (select) {

			case 1:
				System.out.println("Para miktari : ");
				price = input.nextInt();
				balance += price;
				System.out.println("Bakiyeniz : " + balance);
				break;

			case 2:
				System.out.println("Para miktari : ");
				price = input.nextInt();

				if (price > balance) {
					System.out.println("Bakiye Yetersiz.");
				} else {
					balance -= price;
					System.out.println("Bakiyeniz : " + balance);
				}
				break;

			case 3:
				System.out.println("Mevcut bakiyeniz:" + balance);
				break;
			case 4:
				System.out.println("Tekrar gor��mek �zere ...");
				break;
			}
		}

	}

}
