package com.Conditional_Loops;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        char a = sc.next().trim().charAt(0);

        if ( a >= 'A' && a <= 'Z' ){
            System.out.println("Upper Case ");
        }
        else
        {
            System.out.println("Lower Case ");
        }
    }
}
