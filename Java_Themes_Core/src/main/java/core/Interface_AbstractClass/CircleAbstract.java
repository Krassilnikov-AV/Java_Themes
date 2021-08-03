/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package core.Interface_AbstractClass;

import core.Interface_AbstractClass.abstractClasses.ShapeAbstract;

/**
 * Класс CircleAbstract
 */
public class CircleAbstract extends ShapeAbstract {
	private  double radius;
	private String color;

	public CircleAbstract(double radius) {
		super("Red");
		this.radius =radius;
	}

	@Override
	public String getName() {
		return "Circle";
	}

	@Override
	public double getSquare() {
		return 3.14159 * radius * radius;
	}
}