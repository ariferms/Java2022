package miniProje2;

public class HarfSesi {
    public void harflerinSesi1() {
        char harf = 'a';

        if (harf == 'a' || harf == 'ı' || harf == 'o' || harf == 'u') {
            System.out.println(harf + " Kalın sesli bir harftir");
        } else if (harf == 'i' || harf == 'ü' || harf == 'ö' || harf == 'e') {
            System.out.println(harf + " İnce sesli bir harftir");
        } else {
            System.out.println("Girdiğiniz harf sesli bir harf değildir. Lürfen sesli bir har giriniz...");
        }

    }

    public char harfKontrolAltr() {
        char[] kalinHarfler = {'a', 'o', 'u', 'ı'};
        char[] inceHarfler = {'i', 'ü', 'ö', 'e'};

        char selectedLetter = 'ü';

        for (char letter : kalinHarfler) {
            if (selectedLetter == letter) {
                System.out.println(letter + " Kalın sesli bir harftir");
                return letter;
            }
        }

        for (char letter2 : inceHarfler) {
            if (selectedLetter == letter2) {
                System.out.println(letter2 + " İnce sesli bir harftir");
                return letter2;
            }
        }
        System.out.println("Girdiğiniz harf sesli bir harf değildir. Lürfen sesli bir har giriniz...");
        return selectedLetter;
    }
}
