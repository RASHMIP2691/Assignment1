package com.company;
import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args){
        int number, count=0 , temp;
        Scanner scanner;
        scanner = new Scanner (System.in);
        System.out.println("Enter an Integer");
        number = scanner.nextInt();
        temp=number;
        while (temp!=0){
            temp =temp /10;
            ++count;
        }
        System.out.printf("Number of digit in %d = %d", number, count);
    }
}
