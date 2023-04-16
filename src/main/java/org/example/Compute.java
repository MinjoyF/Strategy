package org.example;

public class Compute {

    double a ;

    public Compute( double a){
        this.a= a;
    }

    public Compute(){}

    @Override
    public String toString() {
        return "sum:"+ sum();
    }

    public double sum(){
        return  a+10;
    }

}
