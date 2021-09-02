package com.company;

public class EvenOdd {

        public static void main(String[] args) {
            int n = 2, count = 1;

            while(n <= 100) {
                if (n % 2 == 0) {
                    System.out.println(n);
                    n = n + (4 * count);
                    count++;
                }
            }
        }
    }

