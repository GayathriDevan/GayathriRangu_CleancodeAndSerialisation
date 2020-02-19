package com.gayathri.Interest;


public class TypesOfInterest {
public static void main(String args[])
{
	  System.out.println("simple interest is\n");
	  SimpleInterest s=new SimpleInterest();
	  System.out.println(((SimpleInterest) s).calculatingSimpleInterest());
	  System.out.print("compound interest is\n ");
	  CompoundInterest c=new CompoundInterest();
	  System.out.println(c.calculatingCompoundInterest());
	  
	}
}
