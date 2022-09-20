package reCap;

import arraysDemo.ArraysDemo;
import switchDemo.SwitchDemo;
import whileDemo.WDemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        Integer[] sayilar = {20, 26, 30, 7, 40, 67};

        int max = Collections.max(Arrays.asList(sayilar));
        int min = Collections.min(Arrays.asList(sayilar));

        //System.out.println("Max Sayı: " + max);
        //System.out.println("Min Sayı: " + min);

        SwitchDemo swc = new SwitchDemo();
        WDemo whl = new WDemo();
        ArraysDemo arr = new ArraysDemo();

        //swc.switchDemo();
        //whl.wDemo();
        arr.arraysDemo();
    }
}
