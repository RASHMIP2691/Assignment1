package com.company;

public class Pattern1 {

    public static void main(String[] args) {
	// write your code here
        int r=1,c=1,n;

        do{
            n=5;
            do{
                System.out.print("");
                n--;
            }while(n>=r);
            c=1;
            do{
                System.out.print("*"+" ");
                c++;
            }while (c<=r);
            System.out.println(" ");
            r++;
        }while (r<=5);
    }
}
