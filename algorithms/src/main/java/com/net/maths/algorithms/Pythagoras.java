package com.net.maths.algorithms;

public class Pythagoras {
	private double hypotenuse;
	private double width;
	private double height;

	public double getHypotenuse() {
		return hypotenuse;
	}
	
	public double calculateHypotenuse(double width, double height) {
		this.width = width;
		this.height = height;
		
		hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return hypotenuse;
	}

	public void setHypotenuse(double hypotenuse) {
		this.hypotenuse = hypotenuse;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
