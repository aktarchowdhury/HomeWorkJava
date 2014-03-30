package com.method.practice;

public class JavaPractice2WithParameter {

	public static void main(String[] args) {
	int result=add(20,30,40)+30;
	System.out.println("main method result"+result);
	System.out.println(result+40);
	System.out.println(result-40);
	int boss=multi(20,30,40)+20;
	System.out.println(boss+"main method result");

	}
public static int add(int john,int ron, int paul){
	int result=john+ron+paul;
	System.out.println(result);
	return result;
}
public static int multi(int x,int y,int z){
	int boss=x*y*z;
	System.out.println(boss);
	return boss;
}
}
