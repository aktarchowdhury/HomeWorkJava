package com.aktar.extend;
import java.util.Scanner;

public class CalculatorClass {

	public static void main(String[] args) {
	Scanner Aktar= new Scanner(System.in);
	double FirstNumber,SecondNumber,Result;
	System.out.println("Enter FirstNumber");
	FirstNumber= Aktar.nextDouble();
	System.out.println("Enter SecondNumber");
	SecondNumber= Aktar.nextDouble();
	Result=FirstNumber-SecondNumber;
	System.out.println(Result);
	}

}
