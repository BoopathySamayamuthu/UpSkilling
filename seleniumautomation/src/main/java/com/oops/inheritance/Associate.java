/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on May 31, 2018
 */

package com.oops.inheritance;

/**
 * @author n0217055
 *
 */
public class Associate {

private String id;
private String salary;
private String yearsOfExp;
private String designation;

public Associate() {
	id = "1";
	salary = "2";
	yearsOfExp = "2018";
	designation = "Tester";
	
}

public Associate(String id, String salary, String yearsOfExp, String designation) {
	this.id = "1";
	this.salary = "2";
	this.yearsOfExp = "2018";
	this.designation = "Tester";
}

public int getDesignation(){
	int x = 2;
	int y = 3;
	//return designation;
	return x+y;
	

}
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the salary
 */
public String getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(String salary) {
	this.salary = salary;
}
/**
 * @return the yearsOfExp
 */
public String getYearsOfExp() {
	return yearsOfExp;
}
/**
 * @param yearsOfExp the yearsOfExp to set
 */
public void setYearsOfExp(String yearsOfExp) {
	this.yearsOfExp = yearsOfExp;
}
/**
 * @param designation the designation to set
 */
public void setDesignation(String designation) {
	this.designation = designation;
}
public void printParentAttributes(){
	System.out.println("Parentprop");
	setId("238907");
	System.out.println(getId());
}

public int add(int a, int b) {
	a = 5;
	b=6;
	return a+b;
}
}
