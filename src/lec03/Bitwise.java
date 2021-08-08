package lec03;

import java.sql.SQLOutput;

//https://www.cnblogs.com/shuaiding/p/11124974.html
public class Bitwise {
    public static void main(String[] args) {
        int a = 129;
        int b = 128;
        // and or not xor
        System.out.println(a & b);
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(a | b);
        System.out.println(~a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(~b);
        System.out.println(a ^ b);


        int c = -b;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b >> 1));
        System.out.println(b >> 1);
        System.out.println(Integer.toBinaryString(b << 1));//低位补0
        System.out.println(b << 1);
        System.out.println(Integer.toBinaryString(b >>> 1));
        System.out.println(b >>> 1);
        System.out.println(Integer.toBinaryString(c));
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c >> 1));
        System.out.println("c>>1");
        System.out.println(c >> 1);
        System.out.println(Integer.toBinaryString(c >>> 1));//无论正负高位补0
        System.out.println(c >>> 1);
        //System.out.println(Integer.toBinaryString(c>>>1));

/*
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(max >> 1);
        System.out.println(max << 1);
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(max << 1)); */



    }
}
