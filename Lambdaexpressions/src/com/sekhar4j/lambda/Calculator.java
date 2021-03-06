package com.sekhar4j.lambda;

public class Calculator {
	  
    interface IntegerMath {
        int operation(int a, int b);   
    }
  
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
 
    public static void main(String... args) {
    
        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath division = (a, b) -> a / b;
        System.out.println(division.operation(45, 5));
        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction));   
        System.out.println("600 / 30 = " +
                myApp.operateBinary(600, 30, division));   
    }
}
