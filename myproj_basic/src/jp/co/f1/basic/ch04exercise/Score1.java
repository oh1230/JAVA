package jp.co.f1.basic.ch04exercise;

public class Score1 {

	String name;
	int[] score = new int[5];
	int total;
	double ave;

	public Score1() {
		this.name = null;
		for (int i = 0; i < this.score.length; i++) {
			this.score[i] = 0;
		}
		this.total = 0;
		this.ave = 0.0;
	}
}
