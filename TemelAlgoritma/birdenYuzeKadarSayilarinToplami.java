package TemelAlgoritma;

public class birdenYuzeKadarSayilarinToplami {
    public static void main(String[] args) {
        int i;
        int toplam = 0;

        for (i = 1; i < 100; i++) {
            toplam = toplam + i;
        }
        System.out.println("1'den 100'e kadar olan sayilarin toplami:" + toplam);
    }
}
