package com.week5.quiz;

public class QuizTime {

	public static void main (String[] args) {
		Quiz newQuiz = new Quiz();
		DisplayQuestion demo= new DisplayQuestion(null);
	    QuestionPaper list= new QuestionPaper();
       	list.generateQuestions();
		System.out.println("Its Quiz Time! you have 10 secs to answer this quiz");
		System.out.println("There are 5 Questions. 3 2 1 Lets start");
		int count=0;
		for (Question question: list.quizList) {
		    Question qs = list.getQuestion(count++);
			System.out.println(qs.getQuestion());
			System.out.println("The options are: ");
			System.out.println("1. " + qs.getOpt1());
			System.out.println("2. " + qs.getOpt2());
			System.out.println("3. " + qs.getOpt3());
			System.out.println("4. " + qs.getOpt4());
			System.out.println("Your Answer:  \n");
			newQuiz.startQuestion(question);
			
		}
		System.out.println("Thank u for playing this Quiz");
		System.out.println("Your Final Score is " + demo.score + " out of 5!");
	}
}