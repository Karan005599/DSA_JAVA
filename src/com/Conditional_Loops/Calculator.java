package com.Conditional_Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // input the operator and numbers from user

        int Result = 0;

        while (true) {   // loop will run for infinite times

            System.out.print("Enter the Operator :  ");
            char operator = sc.next().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {

                System.out.println("Enter the Number");

                int Num1 = sc.nextInt();
                int Num2 = sc.nextInt();

                if (operator == '+') {
                    Result = Num1 + Num2;
                }
                if (operator == '-') {
                    Result = Num1 - Num2;
                }
                if (operator == '*') {
                    Result = Num1 * Num2;
                }
                if (operator == '/') {
                    if (Num2 != 0) {  // number 2 cant be divided by 0
                        Result = Num1 / Num2;
                    }
                }
                if (operator == '%') {
                    Result = Num1 % Num2;
                }

            } else if (operator == 'x' || operator ==  'X'){
                break;  // to stop the infinite loop


            }else{
                System.out.println("Invalid Operator");
            }
            System.out.println("Result :"+Result);

        }

    }
}
