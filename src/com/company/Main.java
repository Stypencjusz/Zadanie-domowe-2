package com.company;

import java.util.Scanner;

/**
 * Created by Bartosz on 20.11.2015.
 */



public class Main {


    public static int fibr(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else
            return fibr(n - 1) + fibr(n - 2);
        }
    public static int fibi(int n){
        int a=0;
        int b=1;
        int w=0;
        if ((n == 1) || (n == 2)) {
            return 1;
        } else
            for(int i = 2; i <= n; i++){
                w = a + b;
                a= b;
                b = w;
            }return w;
    }

    public static void main(String[] args) {
	// write your code here
        int i;
        System.out.println("Podaj wyraz ciagu Fibonnaciego ");
        Scanner odczyt = new Scanner(System.in);
        i = odczyt.nextInt();
        odczyt.close();
        System.out.println("Rozwiazanie rekurencyjne to "+ fibr(i));
        System.out.println("Rozwiazanie iteracyjne to "+ fibi(i));
    }
}
