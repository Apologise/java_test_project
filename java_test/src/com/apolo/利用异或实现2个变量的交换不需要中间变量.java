package com.apolo;

import java.util.Scanner;

public class �������ʵ��2�������Ľ�������Ҫ�м���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		System.out.println("A"+A);
		System.out.println("B"+B);
		
		A=A^B;
		B=B^A;
		A=A^B;
		System.out.println("A"+A);
		System.out.println("B"+B);
	}

}
