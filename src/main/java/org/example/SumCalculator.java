package org.example;

public class SumCalculator {
    public static int sum(int n){
        if (n <= 0){
            throw new IllegalArgumentException("Не відповідає умові");
        }
        return(n*(n+1)/2);
    }
}
