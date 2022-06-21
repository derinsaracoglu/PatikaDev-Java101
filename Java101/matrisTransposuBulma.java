package TemelAlgoritma;

public class matrisTransposuBulma {

	public static void main(String[] args) {
		int[][] a = { { 1, 3, 5 }, { 2, 4, 6 } }; // 2x3
		// int[][] aT = {{2, 5}, {3, 6}, {4, 4}}; //3x2 a'nýn Transpozu

		// System.out.println(Arrays.deepToString(a)); //2Boyutlu dizi yazdýrmak için
		// "deepToString" komutu kullan
		// System.out.println(Arrays.deepToString(aT));

		System.out.println("Matris : ");
		for (int i = 0; i < a.length; i++) { // a.length = a dizisinin satýr(row) sayýsý
			for (int j = 0; j < a[0].length; j++) { // a[0].length = a dizisinin sütun(column) sayýsý
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
