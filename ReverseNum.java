package com.company;

class ReverseNum {
    public static void main(String[] args)
    {
        int num=9735,rev=0;
        while(num!=0)
        {
            int number = num % 10;
            rev=rev*10+number;
            num=num/10;
        }
        System.out.println("Reverse of number is "+rev);
    }
}
