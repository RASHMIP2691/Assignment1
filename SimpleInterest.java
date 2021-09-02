package com.company;

class SimpleInterest {
    public static void main(String[] args) {
        float p, r, t, si;
        p = 25000;
        r = 9;
        t = 6;
        si = (p * r * t) / 100;
        System.out.println("Simple Interest is:" + si);
    }
}
