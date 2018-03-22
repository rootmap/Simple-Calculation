package com.selfcode.space.simplecalculation;

public class SimpleCalc {
	
	private double x=0;
	private double y=0;
	//constructor
	public SimpleCalc(double num,double num_two)
	{
		x=num;
		y=num_two;
	}
	//using static method
	public static String multiNum(double x,double y)
	{
		double rr=0;
		       rr=(x*y);
		return rr+"";
	}
	
	//non-Static Method
	public String multiNumC()
	{
		double calc=0;
		       calc=x*y;
		
		return calc+"";
	}
}
