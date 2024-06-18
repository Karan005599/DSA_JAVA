package com.Practice;

public class TypeCasting {
    public static void main(String[] args) {
        int s = (int)(254.215f);
        System.out.println(s);
        byte b = (byte) (257); // 256 % 257 == 1
        System.out.println(b);

    }
}
