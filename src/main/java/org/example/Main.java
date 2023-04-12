package org.example;

public class Main {
    public static void main(String[] args) {
        Compute compute = new Compute(3);
        double sum = compute.sum();
        System.out.println("Sum:"+ sum);
    }
}