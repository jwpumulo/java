package com.yedam.stream;

public class Student {

	private String name;
	private double height;
	private double weight;
	private int score;

	public Student(String name, double height, double weight, int score) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
