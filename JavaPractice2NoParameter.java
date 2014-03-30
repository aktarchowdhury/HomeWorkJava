package com.method.practice;

public class JavaPractice2NoParameter {

	public static void main(String[] args) {
	add();
	add();
	sub();
	multi();
	divide(); 

	}
public static void add(){
	int paul=35;
	int feroz=50;
	int james=paul+feroz;
	System.out.println(james);
}
public static int sub(){
	int james=78;
	int john=30;
	int ram=james-john;
	System.out.println(ram);
	return ram;
	
}
public static int multi(){
	int jack=45;
	int james=32;
	int ron= jack* james;
	System.out.println(ron);
	return ron;
	
}
	
public static int divide(){
	int c= 990;
	int d= 30;
	int m= c/ d;
	System.out.println(m);
	return m;
	
}	
	
}

