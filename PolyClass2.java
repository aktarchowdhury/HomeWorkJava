package com.poly.second;

import com.poly.sign.PolyClassPoly1;

public class PolyClass2 extends PolyClassPoly1 {

	public static void main(String[] args) {
		multi(15, 43, 45);
		multi(20,34,12,8);
		add(20, 30, 66);
		add(89, 23, 32, 44);

	}

	public static void multi(int Berry, int Garry, int John) {
		int results = Berry * Garry * John;
		System.out.println(results);
	}
	public static void multi(int Ron,int John,int Michael,int Nancy){
		int result=Ron*John*Michael*Nancy;
		System.out.println(result);
		
	}
}
