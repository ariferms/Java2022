package miniProje;

public class AsalSayi {
    public void asalSayiHesapla() {

        int sayi = 7;
        int say = 0;

        if (sayi > 0){
            for (int i = (sayi - 1); i > 1; i--) {
                int sonuc = sayi % i;
                if (sonuc != 0) {
                    say += 1;
                }
            }
            if (say == (sayi - 2)) {
                System.out.println("Asal Sayı= " + sayi);
            } else {
                System.out.println(sayi + " Asal Sayı Değil...");
            }
        } else {
            System.out.println("Lütfen geçerli bir sayı giriniz...");
        }

    }
}
