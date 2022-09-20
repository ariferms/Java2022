package whileDemo;

public class WDemo {

    public void wDemo() {

        int i = 1;

        System.out.println("While Döngüsü:");
        while (i < 10) {
            System.out.println(i);
            i += 1;
        }
        System.out.println("*************");
        System.out.println("Do-While Döngüsü:");

        int j = 1;
        do {
            System.out.println(j);
            j += 1;
        } while (j < 10);
    }
}
