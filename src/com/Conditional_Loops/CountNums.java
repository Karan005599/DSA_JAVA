package com.Conditional_Loops;

import java.sql.SQLOutput;

public class CountNums {
    public static void main(String[] args) {
         int n = 252424242;
         int count = 0;

//         while ( n>0){
//             int rem = n%10; // to find the last number
//             if( rem == 5 ){
//                 count ++;
//             }
//             n /= 10;  // to remove last number
//         }
//         System.out.println(count);
        for ( int i = 0; i<n ; i++ ){   // For Loop
            int rem = n%10;
            if (rem == 2){
                count +=1;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
