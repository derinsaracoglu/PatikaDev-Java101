package TemelAlgoritma;

import java.util.Scanner;

public class deseneGoreRecursive {

	static int negative(int num) {

		if (num <= 0) {
			return num;
		} else {
			System.out.print(num + " ");
			return negative(num - 5);
		}
	}

	static int positive(int num, int temp) {
		if (num > temp) {
			return num;
		} else {
			System.out.print(num + " ");
			return positive(num + 5, temp);
		}
	}

	public static void main(String[] args) {
           
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("N Sayisi: ");
			int number = input.nextInt();
			
			positive(negative(number),number);
			
			 if (number == 0){
	                break;
	            }
			 System.out.println("\nÇýkýþ için 0'a basiniz.");
		}
	}

}
