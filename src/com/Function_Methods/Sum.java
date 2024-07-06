package com.Function_Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Sum1(); // we will call the full thing through this method
    }

       static void Sum1 () {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the Num1 :");
            int Number1 = input.nextInt();
            System.out.print("Enter the Num2 :");
            int Number2 = input.nextInt();

            int Sum = Number1 + Number2;

            System.out.println("The Sum is : " + Sum);
        }
    }

