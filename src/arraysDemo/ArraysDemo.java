package arraysDemo;

public class ArraysDemo {
    public void arraysDemo(){
        String[] ogrenci = {"Ahmet", "Arif", "Şamil", "Can", "Mete", "Esra", "Hicran", "Gülseren"};

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Mert";
        ogrenciler[1] = "Murat";
        ogrenciler[2] = "Berk";

        System.out.println("******* 1. Array *******");
        for (int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("******* 2. Array *******");
        for (int j = 0; j < ogrenci.length; j++){
            System.out.println(ogrenci[j]);
        }

        for (String orgc:ogrenci) {
            System.out.println(orgc);
        }


    }
}
