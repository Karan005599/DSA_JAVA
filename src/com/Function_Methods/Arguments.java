package com.Function_Methods;

public class Arguments {
    public static void main(String[] args) {
//        int ans = Sum(20 , 40);
//        System.out.println(ans);
//
//    }
//    static  int Sum (int a, int b){
//        int sum = a+ b ;
//        return  sum;
        String Personalized = message("Suraj Kumar Mohapatra");
        System.out.println(Personalized);

    }

    static  String message (String name){
        String greet = "Hello " + name ;
        return  greet;
    }
}
