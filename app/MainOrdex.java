package com.ordex.app;

import com.ordex.c1.Ordexproject;
import com.ordex.c1.Project1;
import com.ordex.util.Ordexmath;
import com.ordex.util.Ordexhide;

public class MainOrdex {
    public static void main(String[] args) {
        // Creating an object of Ordexproject class
        Ordexproject obj = new Ordexproject("bhavik", 21);
        String name = obj.getname();
        int age = obj.getage();
        System.out.println("name is " + name);
        System.out.println("age is " + age);

        // Creating an object of Project1 class
        Project1 obj2 = new Project1("nikunj", 25);
        String newname = obj2.getname();
        int newage = obj2.getage();

        System.out.println("new name is " + newname);
        System.out.println("new age is " + newage);

        // Performing some numerical operations
        int sum = Ordexmath.add(10, 20);
        double result = Ordexmath.divide(50.0, 2.5);

        // Printing the results
        System.out.println("Sum: " + sum);
        System.out.println("Result of division: " + result);

        Ordexhide o2=new Ordexhide();
        o2.application();
        o2.Ordexapplication();
    }
}
