package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		System.out.println("단을 입력해주세여");
		System.out.print("단 :");
		int dan = sc.nextInt();
		
		while(i<10) {
			System.out.println(dan+"*"+i+"="+dan*i);
			
			i++;
		}
		
		
		
		sc.close();
	}

}
