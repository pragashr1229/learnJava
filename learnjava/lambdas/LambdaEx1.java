package com.learnjava.lambdas;

public class LambdaEx1 implements Drawable {
	int width = 10;

	public static void main(String[] args) {
		LambdaEx1 lm = new LambdaEx1();
		lm.draw();
	}

	@Override
	public void draw() {
		System.out.println("Drawing " + width);
	}
}
