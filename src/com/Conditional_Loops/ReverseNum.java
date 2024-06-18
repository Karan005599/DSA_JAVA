package com.Conditional_Loops;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 54785;
        int  rev = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            n = n / 10;
//            rev = (rev *10)+rem;
//        }
//        System.out.println(rev);

        for ( int i = 0;i < n;i++){  // for loop

            int rem = n%10;
            n /=10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
