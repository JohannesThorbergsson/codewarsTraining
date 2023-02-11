package org.example;

import java.util.Arrays;

public class ProdFibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(Long.MAX_VALUE)));
    }
    public static long[] productFib(long prod) {
        long currentProduct=0;
        long nFibonacci =0;
        while (currentProduct< prod && currentProduct < 5056077604922913919L) {
            currentProduct = fibonacci(nFibonacci)*fibonacci(nFibonacci+1);
            if(prod== currentProduct) {
                return new long[] {fibonacci(nFibonacci), fibonacci(nFibonacci+1), 1};
            }
            nFibonacci++;
            System.out.println(currentProduct);
        }
        return new long[] {fibonacci(nFibonacci-1), fibonacci(nFibonacci), 0};
    }

    private static long fibonacci(long nFibonacci) {
        if(nFibonacci==0) {
            return 0;
        } else if (nFibonacci==1) {
            return 1;
        } else {
            return fibonacci(nFibonacci-2)+fibonacci(nFibonacci-1);
        }
    }
//    private static long fibonacci(long nFibonacci) {
//
//    }
}
