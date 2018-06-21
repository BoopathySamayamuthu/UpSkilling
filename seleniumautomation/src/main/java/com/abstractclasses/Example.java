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
public abstract class Example {
	//can have normal method 
	// can have abstract method
	// declare fields
    String objectName = " ";
     
    Example(String name)
    {
        this.objectName = name;
    }
     
    // declare non-abstract methods
    // it has default implementation
    public void moveTo(int x, int y)
    {
        System.out.println(this.objectName + " " + "has been moved to"
                                   + " x = " + x + " and y = " + y);
    }
     
    // abstract methods which will be
    // implemented by its subclass(es)
    abstract public double area();
    abstract public void draw();


}
