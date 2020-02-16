package entities;

import entities.enums.Color;

public final class Circle extends Shape{
	
	private double radius;
	
	// Constructor
	public Circle() {
	}
		
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	// Get and Set
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Methods
	@Override
	public final double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}
