package com.kodilla;

public class Calculator {

    public static void main(String[] args) {
	    int x = 10;
	    int y = 7;
        System.out.println("Resoult of addition " + x + " and " + y + " is " + addition(x, y));
        System.out.println("Resoult of subtraction " + x + " and " + y + " is " + subtraction(x, y));
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }
}
