package com.Conditional_Loops;

public class Demo {
    public static void main(String[] args) {
        /*
        Synatx :

        if (boolean value T or F){

        // body

        } else {

        // body

       }
         */

        int salary = 5256;

         if (salary > 10000) {

            salary += 2000;

        }
        else if (salary > 5000) {
            salary += 3000;
        }
        else {
            salary += 1000;
         }
        System.out.println(salary);
    }
}
