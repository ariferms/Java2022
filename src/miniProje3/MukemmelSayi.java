package miniProje3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MukemmelSayi {
    public void mukemmelSayiBul(){

        int mSayi = 17;

        List<Integer> say = new ArrayList<>();

        for (int i = 1; i < mSayi; i++){
            int sonuc = mSayi % i;
            if (sonuc == 0){
                say.add(i);
            }
        }
        // reduce liste içindeki elemanların hepsine giderek bir işlem yapar.
        // Burada da her bir elemana gidip sum işlemi yapmıştır.
        int sonucToplam = say.stream().reduce(0, Integer::sum);
        if (sonucToplam == mSayi){
            for (int bolenSayilar : say) {
                System.out.println("*****Bölen Sayılar*****");
                System.out.println(bolenSayilar);
            }
            System.out.println("***********************");
            System.out.println("Tam bölenlerinin toplamı= " + sonucToplam);
            System.out.println(mSayi + " Mükemmel sayıdır...!");
        } else {
            System.out.println("Tam bölenlerinin toplamı= " + sonucToplam);
            System.out.println(mSayi + " Mükemmel sayı değildir :(");
        }

    }
}
