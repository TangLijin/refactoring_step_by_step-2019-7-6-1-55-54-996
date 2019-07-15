package com.tws.refactoring;

public class Driver {
    //    public int age;
    private static  final  int LEGAL_AGE = 18;
    private int age;

//    public Driver(int age) {
//        this.age = age;
//    }



    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLegaDriver(){
        return age >= LEGAL_AGE;
    }
}
