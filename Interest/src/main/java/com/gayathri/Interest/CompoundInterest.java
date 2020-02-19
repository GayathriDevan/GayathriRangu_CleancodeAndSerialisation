package com.gayathri.Interest;


public class CompoundInterest {
	 
	  public double calculatingCompoundInterest()
	    { 
	        double principle = 10000, rate = 10.25, time = 5;
	        double compoundInterest = principle * 
	                    (Math.pow((1 + rate / 100), time)); 
	          return compoundInterest;
}
	  }
