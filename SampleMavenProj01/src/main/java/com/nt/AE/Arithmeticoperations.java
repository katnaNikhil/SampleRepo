package com.nt.AE;

public class Arithmeticoperations 
{
   public int add(int x,int y)
   {
	   return x+y;
   }
   
   public int sub(int x,int y)
   {
	   return x-y;   
   }
   
   public static void main(String[] args) 
   {
	  Arithmeticoperations aobj=new Arithmeticoperations();

	  System.out.println(aobj.add(75,75));
	  System.out.println(aobj.sub(60,50));
   }
   
}
