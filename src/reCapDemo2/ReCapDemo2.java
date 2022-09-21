package reCapDemo2;

import java.util.Arrays;
import java.util.Collections;

public class ReCapDemo2 {
    public void reCapDemo2(){
        double[] myList = {1.2,3.4,5.6,7,-17.2};
        double max = myList[0];
        for (double number : myList) {
            if (max<number){
                max = number;
            }
            System.out.println(number);
        }
        double totalMyList = Arrays.stream(myList).sum();
        System.out.println("MyList Total: " + totalMyList);
        System.out.println("En Büyük Sayı: " + max);

    }
}
