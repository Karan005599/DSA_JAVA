package com.Conditional_Loops;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fruit : ");
        String fruit = sc.nextLine();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits ");
            case "Apple" -> System.out.println("Red in all fruit ");
            case "Grapes" -> System.out.println("Yellow in all fruit ");
            default -> System.out.println("Not a valid fruit ");
        }

    }
}
 