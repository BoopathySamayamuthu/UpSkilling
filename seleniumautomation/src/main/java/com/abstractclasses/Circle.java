/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 7, 2018
 */

package com.abstractclasses;

/**
 * @author n0217055
 *
 */
class Circle extends Example{

	/**
	 * @param name
	 */
	Circle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.abstractclasses.Example#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		System.out.println(
				"The Area is calculated");
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.abstractclasses.Example#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	public static void main (String[] args) 
    {
		Circle obj2 = new Circle("Test");
		obj2.moveTo(1, 2);
		obj2.area();
    }
}
