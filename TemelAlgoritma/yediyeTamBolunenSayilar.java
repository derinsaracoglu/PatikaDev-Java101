package TemelAlgoritma;

import java.util.Scanner;

public class yediyeTamBolunenSayilar {

	public static void main(String[] args) {
		int i,n,m;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ba�lang�� sayisini giriniz:");
		n=sc.nextInt();
		
		System.out.println("Biti� sayisini giriniz:");
		m=sc.nextInt();
		
		for(i=n;i<m;i++) {
			if(i%7==0) {
				System.out.println(i+ " ");
		}
		
		

	}

}
}
