package com.week5.quiz;

import java.util.Scanner;

class DisplayQuestion implements Runnable {
    
	Question question;
	Scanner scanner;
	public static int score = 0;
	
	public DisplayQuestion(Question q) {
		this.question = q;
	}
	
	@Override
	public void run() {
	    
		scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		
		if(this.question.verifyAnswer(inputString)) {
			System.out.println("Hurray! You Answer is correct");
			score++;
			System.out.println("Your Score: "+score);
		}
		else {
			System.out.println("oops! better luck next time");
			System.out.println("Your Score: "+score);
		}

	}
	
}
public class Quiz {
	
	public static int count = 0;
	
	boolean timerUp=false;
	public void startQuestion(Question q) {
	        
		Thread startQuestionThread = new Thread(new DisplayQuestion(q));
		startQuestionThread.setDaemon(true);
		startQuestionThread.start();
	    long start = System.currentTimeMillis();
		while (!timerUp && System.currentTimeMillis() <= start + 10000);
		 if(!timerUp)
				{
				    System.out.println("Time's up");
				}
	}
}
				
				