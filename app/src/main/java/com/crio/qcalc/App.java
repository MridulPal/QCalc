
package com.crio.qcalc;


public class App {

    public String getGreeting() {

        return "Hello World!";

    }


   

   public static void main(String[] args) {

    System.out.println("Starting QCalc..");

    StandardCalculator calc = new StandardCalculator();

    calc.multiply(1, 2);
    calc.add(1, 2);
    calc.subtract(1, 2);
    calc.divide(1, 2);
    System.out.println(calc.getResult());

}


}

