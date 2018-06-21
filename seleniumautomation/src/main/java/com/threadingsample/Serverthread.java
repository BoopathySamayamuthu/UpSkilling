/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 20, 2018
 */

package com.threadingsample;

/**
 * @author n0217055
 *
 */
public class Serverthread {
	public static void main(String args[]){
//		Task taskRunner = new Task();
//		taskRunner.start();
		System.out.println("Learning Thread");
		Task taskRunner = new Task("Thread - A");
		Thread t1 = new Thread(taskRunner);
		t1.start();
		//taskRunner.start();
		//taskRunner.start();// Not recommeded to same thread again but we can create new instance to start the thread again
		
		System.out.println("Learning Thread 1");
		Task taskRunner2 = new Task("Thread- B");
		Thread t2 = new Thread(taskRunner2);
		t2.start();
		

	}
}
	
class Task implements Runnable{
	
	String name;
	
	public Task(String name){
		this.name = name;
	}
	
	
	public void run(){
		
		Thread.currentThread().setName(name);
		
		for(int i=0; i <100;i++){
			System.out.println("Number:" + i + "-" + Thread.currentThread().getName());
			
			//getName method helps find which Thread is executed
			
			//System.out.println("Thread method is Running is concurrently");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
	
}

