package com.Function_Methods;

public class Scoping {
    public static void main(String[] args) {
        // scoping basically means where we can access our variables

        int a = 10 ;
        int b = 20;
        {
            // block function
            a = 88 ; // we can change the value but we cant initialize it again weather it is in the block or outside the block
            // we have reassigned the new value of 88 from 10 ;
            int c = 90 ;
            System.out.println(a); // it will show the value which is initialized inside the block
            // value which is initialized in the block will remain in the block we cant use it outside
        }
        System.out.println("the ouside block " + a );
         // System.out.println(num); it will not allow us to print num because it is in a different function which is random
    }
    static  void random (){
        // System.out.println(a); if we try to print 'a', it will not allow me because it is initialized in a different function

        int num = 35 ;
        System.out.println(num); // we can access num but not a
    }
}
