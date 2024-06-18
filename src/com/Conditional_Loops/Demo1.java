package com.Conditional_Loops;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        /*
          Q.Print numbers of  n ?

          Syntax of for loop

          for (initialization; condition; increment / decrement){

          //body

          }
         */
         for (int i = 1;i<=n; i+=1){
            System.out.print(i + " ");
        }

    }
}
