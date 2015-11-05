/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.thread
 *     |_ Runner
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class Runner2 implements Runnable {
	private String name;


	public Runner2(String name) {
		super();
		this.name = name;
	}
	
	public Runner2() {
		
	}
	
	public void run() {
		int d = 100;
		System.out.println(name + " start");
		
		for(int i=100 ; i>0 ; i-=10) {
			System.out.println(name + " " + i + " 미터");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " 골인");
	}
	

}
