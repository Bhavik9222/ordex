package com.ordex.util;

abstract class Ordex1 {

    abstract void Ordexapplication();

    public void application() {
        System.out.println("good");
    }

}

public class Ordexhide extends Ordex1 {
    public void Ordexapplication() {
        System.out.println("company is very great");
    }

}




