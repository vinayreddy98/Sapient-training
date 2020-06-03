package com.example.mobile;

import org.springframework.stereotype.Component;

@Component
public class Screen {

	private int length;
	
	private int breadth;
	
//	public Screen(int length, int breadth) {
//		super();
//		this.length = length;
//		this.breadth = breadth;
//	}
//	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am screen");
	}

	

	@Override
	public String toString() {
		return "Screen [length=" + length + ", breadth=" + breadth + "]";
	}

	

}
