package com.javaex.ex01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바, 2.C, 3.C++, 4.파이썬)");
		System.out.print("과목번호: ");
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println("R101호");
		}
		else if(num==2) {
			System.out.println("R202호");
		}
		else if(num==3) {
			System.out.println("R303호");
		}
		else if(num==4) {
			System.out.println("R404호");
		}
		else {
			System.out.println("상담원에게 문의하세요");
		}
		
		
		
		
		sc.close();
	}

}
