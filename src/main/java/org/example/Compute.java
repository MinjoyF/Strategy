package org.example;

public class Compute {

    double a ;

    public Compute( double a){
        this.a= a;
    }
    @Override
    public String toString() {
        return "############";
    }

    public double sum(){
        return  a+10;
    }

}
