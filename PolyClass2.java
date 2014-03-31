package com.poly.second;

import com.poly.sign.PolyClassPoly1;

public class PolyClass2 extends PolyClassPoly1 {

	public static void main(String[] args) {
		multi(15, 43, 45);
		add(20, 30, 66);
		add(89, 23, 32, 44);

	}

	public static void multi(int Berry, int Garry, int John) {
		int result = Berry * Garry * John;
		System.out.println(result);
	}
}
