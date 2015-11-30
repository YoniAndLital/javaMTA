package com.example.myprojrct;

public class Calculator {

static float circle;
static  double radiusCopy;
static float opposite;
static  double angleCopy;
static int expCopy;
static long  resultPow;
static int baseCopy;

public static void setValues(double radius,double angle,int exp,int base)
{
	radiusCopy=radius;
	angleCopy=angle;
	expCopy=exp;
	baseCopy=base;
}
public static void calcCircle(double radius)
{
	circle=(float) (2*radius*Math.PI);
	
}
public static void findTriangleOpposite(double angle,double hypotenuse)
{
	double change=Math.toRadians(angle);
	opposite=(float) (Math.sin(change)*hypotenuse);
	
}
public static void power(int base,int exp)
{
	resultPow=(int) Math.pow(base, exp);
	
}
public static String getResults()
{
	String resultStr;
	String line1 = new String("calculation 1: Area of circle with radius "+radiusCopy+" is "+circle);
	String line2 = new String("calculation 2: Length of opposite where angle B is " +angleCopy+" is "+opposite+"cm");
	String line3 = new String("calculation 3: Power of "+baseCopy+" with exp of "+expCopy+" is "+resultPow);
	resultStr=line1+"<br>"+"<br>"+line2+"<br>"+"<br>"+line3;
	return resultStr;
}

}
