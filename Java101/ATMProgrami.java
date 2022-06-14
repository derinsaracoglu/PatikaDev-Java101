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
			System.out.print("Kullanýcý Adýnýz :");
			String userName = input.nextLine();

			// Kullanici teyit

			while (!(userName.equals(id))) {

				System.out.println("Kullanýcý adýnýz yanlýþ.Lütfen tekrar deneyiniz.");
				String a = input.nextLine();
				if (a.equals(id)) {
					break;
				}
			}
			System.out.println("Sifrenizi giriniz :");
			String password = input.nextLine();
			String b = "";
			while (!(password.equals(pass))) {

				System.out.println("Hatalý þifre girdiniz. Kalan hakkýnýz : " + right);
				password = input.nextLine();
				right--;

				if (right == 0) {
					System.out.println("hesabýnýz bloke olmuþtur");
					return;
				}
			}

			// Para yatirma-cekme iþlemleri

			System.out.println("Lütfen yapacaðýnýz iþlemi seçin:\n" + "1.Para Yatirma\n" + "2.Para Çekme\n"
					+ "3.Bakiye Sorgula\n" + "4.Çýkýþ Yap");
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
				System.out.println("Tekrar gorüþmek üzere ...");
				break;
			}
		}

	}

}
