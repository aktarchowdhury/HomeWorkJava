package com.method.practice;

public class JavaFunctionWithReturn {

	public static void main(String[] args) {
 int c= add(5,10)+20;
 System.out.println("main function result"+ c);
 int d= sub(5,10)-10;
 System.out.println("this is the result"+d);
 int f=multi(5,10)+20;
 System.out.println("result"+f);
int k= divide(30,3)* 20+25;
System.out.println("result"+k);
	}
public static int add(int x, int y){
	int c=x+y;
	System.out.println("this is the result"+c);
	return c;
	
	
}
public static int sub(int x, int y){
	int d= x-y;
	System.out.println(d);
	return d;
	
}
public static int multi(int x, int y){
	int f= x * y;
	System.out.println(f);		
	return f;
	
}
public static int divide(int x,int  y){
	int k= x / y;
	System.out.println(k);
	return k;
	


	
}
}
