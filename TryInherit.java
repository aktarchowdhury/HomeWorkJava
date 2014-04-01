package com.aktar.inherit;

import com.aktar.inhertence.JavaInheritence1;

public class TryInherit extends JavaInheritence1 {

	public static void main(String[] args) {
multi();
multi(20,30);
sub(85,32);
calculator(45,5);
String();
Sub(24,23,10);
	}
public static void multi(){
	int Black=25;
	int White=23;
	int Green=Black*White;
	System.out.println(Green);	
}
public static void Sub(int Offwhite, int Red, int Brown){
	int Result=Offwhite+Red-Brown;
	System.out.println(Result);
	}
	
}	



