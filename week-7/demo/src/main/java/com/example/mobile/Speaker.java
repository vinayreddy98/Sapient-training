package com.example.mobile;

import org.springframework.stereotype.Component;

@Component
public class Speaker {

	private int vol_levels;
	
	private String speaker_type;
	
//	public Speaker(int vol_levels, String speaker_type) {
//		super();
//		this.vol_levels = vol_levels;
//		this.speaker_type = speaker_type;
//	}
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am speaker");
	}

	@Override
	public String toString() {
		return "Speaker [vol_levels=" + vol_levels + ", speaker_type=" + speaker_type + "]";
	}

	

}
