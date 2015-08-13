/**
 * 
 */
package org.dimigo.inheritence;

/**
 * <pre>
 * org.dimigo.inheritence
 *     |_ Circle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class Circle extends figure{
	
	/**
	 * @param centerX
	 * @param centerY
	 */
	
	int radius;
	
	public Circle(int radius) {
		super(0, 0);
		this.radius = radius;
	}
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		// TODO Auto-generated constructor stub
	}

	
	protected double calcArea() {
		return radius*radius*Math.PI;
	}
	
	protected void printCenter(){
		System.out.print("원");
		super.printCenter();
	}

}
