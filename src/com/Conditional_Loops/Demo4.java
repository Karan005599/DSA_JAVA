package com.Conditional_Loops;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        // Q. Find Largest of the three numbers

//        if ( a>b && a>c ) {
//            System.out.println("The Largest number is " + a);
//        }
//            else if (b>a && b>c){
//            System.out.println("The Largest number is " + b);
//            }
//            else {
//                System.out.println("The Largest number is " + c);
//        }

        // Another WAY
//        int max = a ;
//        if (b>max) {
//            max = b;
//        }
//         if (c>max) {
//            max = c;
//        }
//        System.out.println("The largest is "+max);

        // ANOTHER way

        int max = Math.max(a,Math.max(b,c));
        System.out.println(max);

        }

    }

