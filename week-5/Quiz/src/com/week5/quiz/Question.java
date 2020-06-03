package com.week5.quiz;

public class Question {
	private String question;
	private String opt1, opt2, opt3, opt4;
	private String correctOption;

	public Question(String string1, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
		this.question = string1;
		this.opt1 = string2;
		this.opt2 = string3;
		this.opt3 = string4;
		this.opt4 = string5;
		this.correctOption = string6;
	}

	public String getQuestion() {
		return question;
	}

	public String getOpt1() {
		return opt1;
	}

	public String getOpt2() {
		return opt2;
	}

	public String getOpt3() {
		return opt3;
	}

	public String getOpt4() {
		return opt4;
	}

	public String getCorrectOption() {
		return correctOption;
	}
	public boolean verifyAnswer (String selectedOption) {
		selectedOption = selectedOption.toLowerCase().trim();
		if (selectedOption.equals(this.correctOption)) {
			return true;
		}
		else {
			return false;
		}
	}

}