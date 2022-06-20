package TemelAlgoritma;

import java.util.Scanner;

public class arrayHarmonikOrtalama {

	public static void main(String[] args) {
		
		int[] list = new int[]{15,3,6,9,25,9};
		
		//dizideki elemanlarýn aritmetik ortalamasýný bulur.
		
		double sum = 0,result=0;
		
		for(int temp: list) {
			sum += temp;
				
		}
		double average = sum / list.length;
        System.out.println("Aritmetik ortalamasi : "+average);
        
        
		//dizideki elemanlarýn harmonik ortalamasýný bulur.
        
		for(int i = 0; i<list.length;i++) {
			for(double j = 1; j<list[i]; j++) {
				result +=(1/j);
			}
		}
	
		double harAvarage = list.length / result;
		System.out.println("Harmonik ortalama:  " + harAvarage);

	}
}
