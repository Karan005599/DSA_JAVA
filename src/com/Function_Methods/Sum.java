package com.Function_Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

       int Ans =  sum2();
        System.out.println(Ans);// we will call the full thing through this method
    }
    static  int sum2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Num1 :");
        int Number1 = input.nextInt();
        System.out.print("Enter the Num2 :");
        int Number2 = input.nextInt();

        int Sum = Number1 + Number2;
          return  Sum;    // if we put return statement then it will not proceed from here the program ends
    }

//       static void Sum1 () {    // Git experiment 
//
//            Scanner input = new Scanner(System.in);
//
//            System.out.print("Enter the Num1 :");
//            int Number1 = input.nextInt();
//            System.out.print("Enter the Num2 :");
//            int Number2 = input.nextInt();
//
//            int Sum = Number1 + Number2;
//
//            System.out.println("The Sum is : " + Sum);
        }


