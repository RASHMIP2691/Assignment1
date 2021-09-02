package com.company;

public class GCD {
    public static void main(String[] args)
    {
        int a=25,b=30;
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.printf("GCD of a and b is " +b);
    }
}
