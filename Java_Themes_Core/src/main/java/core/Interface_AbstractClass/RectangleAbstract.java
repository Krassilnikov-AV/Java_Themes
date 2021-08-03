/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package core.Interface_AbstractClass;

import core.Interface_AbstractClass.abstractClasses.ShapeAbstract;

/**
 * Класс RectangleAbstract
 */
public class RectangleAbstract extends ShapeAbstract {
	private double height;
	private double width;

	public RectangleAbstract(double height, double width) {
		super("Blue");
		this.height = height;
		this.width = width;
	}

	@Override
	public String getName() {
		return "Rectangle";
	}

	@Override
	public double getSquare() {
		return height*width;
	}

}