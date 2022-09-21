package miniProje5;

import java.util.Arrays;

public class SayiBulma {
    public void sayiBul(){

        int[] sayilar = {1,3,5,8,10,14};
        int aranacakSayi = 14;
        boolean bulunduMu = false;

        for (int ara : sayilar) {
            if (ara == aranacakSayi){
                bulunduMu = true;
                System.out.println("Aranan '" + aranacakSayi + "' sayısı dizide bulundu...");
            }
        }
        if (bulunduMu == false){
            System.out.println("Aranan '" + aranacakSayi + "' sayısı dizide bulunamadı!");
        }

    }
}
