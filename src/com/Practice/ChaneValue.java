package com.Practice;

import java.util.Arrays;

public class ChaneValue {
    public static void main(String[] args) {
// create an array
 int [] arr = { 1 , 54 , 6, 68 , 8 };
     change( arr);
        System.out.println(Arrays.toString(arr));
    }
     static  void change(int [] nums ){
        nums [0] = 99; // if you modify any valur via reference variable the object value will be changed
     }
}
