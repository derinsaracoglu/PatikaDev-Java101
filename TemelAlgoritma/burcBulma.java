package TemelAlgoritma;

import java.util.Scanner;

public class burcBulma {

	public static void main(String[] args) {
		int gun, ay;

		Scanner input = new Scanner(System.in);

		System.out.println("Kaçıncı ayda dogdunuz?");
		ay = input.nextInt();

		System.out.println("Ayın kaçında doğdunuz?");
		gun = input.nextInt();

		String burc = "";
		boolean isError = false;

		if(ay == 1 && gun >= 1 && gun <= 31) {
            if(gun <= 21) {
                burc = "Oğlak Burcu";
                System.out.println(burc);
            } else {
                burc = "Kova Burcu";
                System.out.println(burc);
            }
        } else if(ay == 2 && gun >= 1 && gun<= 29) {
            if (gun <= 19) {
                burc = "Kova Burcu";
                System.out.println(burc);
            } else {
                burc = "Balık Burcu";
                System.out.println(burc);
            }
        } else if(ay == 3 && gun >= 1 && gun <= 31) {
            if (gun <= 20) {
                burc = "Balık Burcu";
                System.out.println(burc);
            } else {
                burc = "Koç Burcu";
                System.out.println(burc);
            }
        } else if (ay == 4 && gun >= 1 && gun <= 30) {
            if (gun <= 20) {
                burc = "Koç Burcu";
                System.out.println(burc);
            } else {
                burc = "Boğa Burcu";
                System.out.println(burc);
            }
        } else if (ay == 5 && gun >= 1 && gun <= 31) {
            if (gun <= 21) {
                burc = "Boğa Burcu";
                System.out.println(burc);
            } else {
                burc = "İkizler Burcu";
                System.out.println(burc);
            }
        } else if (ay == 6 && gun >= 1 && gun <= 30) {
            if (gun <= 22) {
                burc = "İkizler Burcu";
                System.out.println(burc);
            } else {
                burc = "Yengeç Burcu";
                System.out.println(burc);
            }
        } else if (ay == 7 && gun >= 1 && gun <= 31) {
            if (gun <= 22) {
                burc = "Yengeç Burcu";
                System.out.println(burc);
            } else {
                burc = "Aslan Burcu";
                System.out.println(burc);
            }
        } else if (ay == 8 && gun >= 1 && gun <= 31) {
            if (gun <= 22) {
                burc = "Aslan Burcu";
                System.out.println(burc);
            } else {
                burc = "Başak Burcu";
                System.out.println(burc);
            }
        } else if (ay == 9 && gun >= 1 && gun <= 30) {
            if (gun <= 22) {
                burc = "Başak Burcu";
                System.out.println(burc);
            } else {
                burc = "Terazi Burcu";
                System.out.println(burc);
            }
        } else if (ay == 10 && gun >= 1 && gun <= 31) {
            if (gun <= 22) {
                burc = "Terazi Burcu";
                System.out.println(burc);
            } else {
                burc = "Akrep Burcu";
                System.out.println(burc);
            }
        } else if (ay == 11 && gun >= 1 && gun <= 30) {
            if (gun <= 21) {
                burc = "Akrep Burcu";
                System.out.println(burc);
            } else {
                burc = "Yay Burcu";
                System.out.println(burc);
            }
        } else if (ay == 12 && gun >= 1 && gun <= 31) {
            if (gun <= 21) {
                burc = "Yay Burcu";
                System.out.println(burc);
            } else {
                burc = "Oğlak Burcu";
                System.out.println(burc);
            }
        } else {
            isError = true;
        }
	}

}
