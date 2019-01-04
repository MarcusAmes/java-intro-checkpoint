package com.galvanize;

import static java.lang.Integer.parseInt;

public class SumOfPositivesCLI {
    public static void main(String[] args) {
        int sum = 0;
        for(String i : args) {
            if(parseInt(i) > 0) {
                sum += parseInt(i);
            }
        }
        System.out.println(sum);
    }
}
