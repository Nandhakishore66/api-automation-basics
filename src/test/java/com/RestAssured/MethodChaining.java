package com.RestAssured;

import java.io.PrintStream;

public class MethodChaining {

    public void methodChainingExample() {
        System.out.println("This is method chaining");
        //Without chaining
        PrintStream printStream = System.out;
        printStream.println("Without chaining");
    }


    public static void main(String[] args) {
        MethodChaining methodChaining = new MethodChaining();
        methodChaining.methodChainingExample();
    }
}
