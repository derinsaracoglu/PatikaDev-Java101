package TemelAlgoritma;

public class matrisTransposuBulma {

	public static void main(String[] args) {
		int[][] a = { { 1, 3, 5 }, { 2, 4, 6 } }; // 2x3
		// int[][] aT = {{2, 5}, {3, 6}, {4, 4}}; //3x2 a'n�n Transpozu

		// System.out.println(Arrays.deepToString(a)); //2Boyutlu dizi yazd�rmak i�in
		// "deepToString" komutu kullan
		// System.out.println(Arrays.deepToString(aT));

		System.out.println("Matris : ");
		for (int i = 0; i < a.length; i++) { // a.length = a dizisinin sat�r(row) say�s�
			for (int j = 0; j < a[0].length; j++) { // a[0].length = a dizisinin s�tun(column) say�s�
				System.out.print(a[i][j] + "  ");
			}
			System.out.println("");
		}

		System.out.println("Transpoze :");
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j][i] + "  ");
			}
			System.out.println("");
		}
	}

}
