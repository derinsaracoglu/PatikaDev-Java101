package TemelAlgoritma;

import java.util.Scanner;

public class EBOBvEKOK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ebob = 0, ekok = 0;
		int max;

		System.out.println("1.Sayýyý giriniz:");
		int sayi1 = scan.nextInt();
		System.out.println("2.Sayýyý giriniz:");
		int sayi2 = scan.nextInt();
		max = sayi1 * sayi2;

		for(int i = 1; i <= sayi1 && i <= sayi2; ++i)
        {
            if(sayi1 % i == 0 && sayi2 % i == 0)
                ebob = i;
        }
 
        ekok = (sayi1 * sayi2) / ebob;
        System.out.printf(" %d ve  %d sayýlarýnýn EBOB'u %d \n", sayi1, sayi2, ebob);
        System.out.printf(" %d ve  %d sayýlarýnýn EKOK'u %d \n", sayi1, sayi2, ekok); 
    } 
}
