package com.repls;
    /*
    Write a program to convert double 500.4444 into long.
    Expected Output:
    500
     */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Repl018 {
    public static void main(String[] args) {
        double num=500.444;
        long b = (long)num;
        System.out.println(b);
    }
}
