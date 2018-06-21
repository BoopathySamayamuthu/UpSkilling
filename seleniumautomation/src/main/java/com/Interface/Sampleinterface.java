/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 7, 2018
 */

package com.Interface;

import org.testng.annotations.Test;

/**
 * @author n0217055
 *
 */

public class Sampleinterface implements Drawable,Circle {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Interface.Drawable#draw(int)
	 */

	
	private double x = 1, y = 2, radius;

	Sampleinterface(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/**
	 * 
	 */
	public Sampleinterface() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String draw(String color) {
		// TODO Auto-generated method stub
		System.out.println(
				"Circle drawn at and color " + color);
	return color;
	}

	double getRadius() {
		return radius;
	}

	double getX() {
		return x;
	}

	double getY() {
		return y;
	}
	void draw(){
		
	}

	/* (non-Javadoc)
	 * @see com.Interface.Circle#draw1(int)
	 */
	@Override
	public int draw1(int color) {
		// TODO Auto-generated method stub
		System.out.println(x);
			
		return 0;
	}
	public static void main(String[] args){

		Sampleinterface obj = new Sampleinterface();
		
		obj.draw("RED");
		obj.draw1(RED);
		System.out.println(Drawable.WHITE);
		
	}
	
}
