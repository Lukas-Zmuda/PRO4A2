package edu.oop.zaklady;

public class WrapperDemo {

	public static void main(String[] args) {

		/*
		 * boolean -> Boolean
		 * char -> Character
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 */

		int a = 10;
		Integer i = Integer.valueOf(a);
		Integer j = a;
		
		System.out.println(j);
		
		Integer ii = new Integer(125);
		int iii = ii;
		
		Integer jjj = 124;
		
		String cisloS = "1244";
		int cisloC = Integer.parseInt(cisloS);
		
		System.out.println(cisloC + 6);
		
		
		
		
		
	}

}
