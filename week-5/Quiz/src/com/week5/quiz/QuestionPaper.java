package com.week5.quiz;

import java.util.ArrayList;

public class QuestionPaper {

	public ArrayList<Question> quizList = new ArrayList<Question>();
	
	void generateQuestions() {
		Question q1 = new Question("Question 1", "Option 1", "Option 2", "Option 3", "Option 4", "b");
		Question q2 = new Question("Question 2", "Option 1", "Option 2", "Option 3", "Option 4", "c");
		Question q3 = new Question("Question 3", "Option 1", "Option 2", "Option 3", "Option 4", "b");
		Question q4 = new Question("Question 4", "Option 1", "Option 2", "Option 3", "Option 4", "c");
		Question q5 = new Question("Question 5", "Option 1", "Option 2", "Option 3", "Option 4", "b");
		this.quizList.add(q1);
		this.quizList.add(q2);
		this.quizList.add(q3);
		this.quizList.add(q4);
		this.quizList.add(q5);
	}

	public Question getQuestion(int i) {
		return quizList.get(i);
	}

}