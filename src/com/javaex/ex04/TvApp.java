package com.javaex.ex04;

public class TvApp {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.setChannel(7);
		t1.channelDown();
		System.out.println("현재채널"+t1.getChannel()+"입니다");
		
		
		
	}

}
