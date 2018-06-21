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
public class Synchronoous {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Sequence sequence = new Sequence();
		//Worker worker1 = new Worker(sequence);
		
		//worker1.start();
//		
//		Worker worker2 = new Worker(sequence);
//		worker2.start();
//		
//		for(int i=0; i <100;i++){
//			System.out.println(sequence.getNext());
//		}

	}
class Worker extends Thread{
	
	Sequence sequence = null;
	public Worker(Sequence sequence){
		this.sequence = sequence;
	}
	
	/**
	 * 
	 */
	public Worker() {
		// TODO Auto-generated constructor stub
	}

	public void run(){
		
		Sequence sequence = new Sequence();
		for(int i=0; i <100;i++){
			System.out.println(Thread.currentThread().getName() + " The value is " + sequence.getNext());
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
	}
}
}
}


