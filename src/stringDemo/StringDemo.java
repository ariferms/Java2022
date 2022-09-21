package stringDemo;

public class StringDemo {
    public void stringDemo() {
        String mesaj = "     Bugün hava çok güzel.    ";
        System.out.println(mesaj);
/*
        System.out.println("Eleman Sayısı: " + mesaj.length());
        System.out.println("5. Eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println("Ne ile başlıyor: " + mesaj.startsWith("B"));
        System.out.println("Ne ile bitiyor: " + mesaj.endsWith("."));

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        //System.out.println("getChars: " + karakterler);

        for (char krkt:karakterler) {
            System.out.print(krkt);
        }
        System.out.println("Kaçıncı eleman: " + mesaj.indexOf("a"));
        System.out.println("Sağdan kaçıncı eleman: " + mesaj.lastIndexOf("a"));

 */
        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2,5));
        System.out.println("**********************");
        String[] splitMesaj = mesaj.split(" ");
        for (int i = 0; i < splitMesaj.length; i++){
            System.out.println(splitMesaj[i]);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
