package com.javaex.ex04;

public class Tv {
	// 필드
	private String color;
	private boolean power;
	private int channel;

	// 생성자
	public Tv(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	public Tv() {}

	public void setColor(String color) {
		this.color = color;
	}

	// 메소드 gs
	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	// 메소드 일반
	
	public void power() {
		power = !power;
	}
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
}
