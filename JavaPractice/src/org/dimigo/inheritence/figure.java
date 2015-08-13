/**
 * 
 */
package org.dimigo.inheritence;

/**
 * <pre>
 * org.dimigo.inheritence
 *     |_ figure
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class figure {
	
	private int centerX;
	private int centerY;
	
	public figure(int centerX, int centerY) {
		this.centerX=centerX;
		this.centerY=centerY;
	}
	protected double calcArea() {
			return 0;
	}
	protected void printCenter(){
		System.out.println("중심좌표 : (" + centerX + "," + centerY + ")");
	}
	protected void moveCenter(int X, int Y) {
		centerX=centerX+X;
		centerY=centerY+Y;
	}

}
