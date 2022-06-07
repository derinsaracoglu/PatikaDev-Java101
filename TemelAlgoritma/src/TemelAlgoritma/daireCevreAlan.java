package TemelAlgoritma;

import java.util.Scanner;

public class daireCevreAlan {

	public static void main(String[] args) {
		
		int r;
		double daireCevre,daireAlan,aci,dilim;
		double pi = 3.14;
		
		//Girdi
		Scanner input= new Scanner(System.in);
		System.out.println("Dairenin yaricapini giriniz:");
		r = input.nextInt();
		
		System.out.println("Aci giriniz:");
		aci = input.nextDouble();
		
		
		//Cevre
		daireCevre= 2*pi*r;
		System.out.println("Dairenin Cevresi:" + daireCevre);
		
		//Alan
		daireAlan = pi * r * r;
		System.out.println("Dairenin Alani:" + daireAlan);
		
		//Daire Dilimi
		dilim =(pi*(r*r)*aci) / 360;
		System.out.println("Daire diliminin alani:" + dilim);
		
		
		
		
		

	}

}
