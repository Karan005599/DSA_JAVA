package com.Conditional_Loops;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID ");
        int EmpId = sc.nextInt();
        System.out.println("Enter Department  Name ");
        String DName = sc.next();


        switch (EmpId) {
            case 12002 -> {
                System.out.println("Suraj Kumar Mohapatra");
                switch (DName) {
                    case "IT" -> System.out.println("IT Department ");
                    case "Dev" -> System.out.println("Developer");
                }
            }
            case 20356 -> {
                System.out.println("Ipsita Maharana");
                switch (DName) {
                    case "IT" -> System.out.println("IT Department ");
                    case "Dev" -> System.out.println("Developer");
                }
            }
            default -> System.out.println("Invalid Employee ID");
        }

        }


    }

