package com.javaex.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.println("당신의 이름은 "+age+" 나이는 "+name+"입니다.");
		
		
		sc.close();
	}

}
