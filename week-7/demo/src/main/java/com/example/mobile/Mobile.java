package com.example.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	Camera camera;
	
	@Autowired
	Speaker speaker;
	
	@Autowired
	Screen screen;
	
	public void Show() {
		// TODO Auto-generated method stub
		camera.show();
		speaker.show();
		screen.show();
	}

}
