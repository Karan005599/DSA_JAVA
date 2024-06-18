package com.Practice;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius :");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9/5 )+ 32;
        System.out.println("The temperature in Fahrenheit is " + tempF);

    }
}
