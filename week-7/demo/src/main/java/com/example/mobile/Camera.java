package com.example.mobile;

import org.springframework.stereotype.Component;

@Component
public class Camera {

	private int no_of_mg_pixels;
	
//	public Camera(int no_of_mg_pixels) {
//		super();
//		this.no_of_mg_pixels = no_of_mg_pixels;
//	}
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am Camera");
	}

	

	@Override
	public String toString() {
		return "Camera [no_of_mg_pixels=" + no_of_mg_pixels + "]";
	}
       
}
