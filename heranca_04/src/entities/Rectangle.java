package entities;

import entities.enums.Color;

public final class Rectangle extends Shape {

	private double width;
	private double height;

	// Constructor
	public Rectangle() {
	}

	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	// Get and Set
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

	// Methods
	@Override
	public final double area() {
		return width * height;
	}
}
