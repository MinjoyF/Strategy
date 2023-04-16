package org.example;

public class Main {
    public static void main(String[] args) {
        Compute compute = new Compute();
        Compute compute1= new Compute(3);
        double sum = compute.sum();
        double sum1 = compute1.sum();
       // System.out.println(compute1.toString());
        System.out.println("Sum:"+ sum);
        System.out.println("Sum:"+ sum1);

    }
}