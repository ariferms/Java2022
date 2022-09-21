package miniProje4;

public class ArkadasSayilar {
    public void arkadasSayiBul() {

        int sayi1 = 220;
        int say1 = 0;

        int sayi2 = 284;
        int say2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if ((sayi1 % i) == 0) {
                say1 = say1 + i;
            }
        }

        for (int j = 1; j < sayi2; j++) {
            if ((sayi2 % j) == 0) {
                say2 = say2 + j;
            }
        }

        System.out.println("Tam Bölen Toplamları= " + sayi1 + " için " + " Toplam= " + say1);
        System.out.println("Tam Bölen Toplamları= " + sayi2 + " için " + " Toplam= " + say2);

        if ((say1 == sayi2) && (say2 == sayi1)) {
            System.out.println(sayi1 + " ve " + sayi2 + " Arkadaş Sayılardır!");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " Arkadaş Sayı Değillerdir...");
        }

    }
}
