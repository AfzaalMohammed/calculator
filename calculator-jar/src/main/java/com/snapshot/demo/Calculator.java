package com.snapshot.demo;

/**
 * Calculator Class
 *
 */
public class Calculator 
{
    public int add(int a, int b)
    {
        return a+b;
    }
	
	public double add(double a, double b)
    {
        return a+b;
    }
	
	public double subtract(double a, double b)
    {
        return a-b;
    }
	
	public double multiply(double a, double b)
    {
        return a*b;
    }
	
	public double divide(double a, double b)
    {
		if (b==0) {
			throw new ArithmeticException();
		}
        return a/b;
    }
}
