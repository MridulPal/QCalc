package com.crio.qcalc;

public class StandardCalculator {

    private int result;
    

       public int getResult()
       {
            return result;
       } 

       private void setResult(int value)
       {
            this.result=value;
       }
       
       
public void clearResult()
{
    result=0;
}


public void printResult(){

    System.out.println("Standard Calculator Result:"+ getResult());

}

    
public void add(int num1, int num2)
{
    setResult(num1+num2); 
}

public void subtract(int num1, int num2)
{
    setResult(num1-num2); 
}

public void multiply(int num1, int num2)
{
    setResult(num1*num2); 
}

public void divide(int num1, int num2)
{
    setResult(num1/num2); 
}


}
