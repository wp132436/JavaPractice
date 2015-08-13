/**
 * 
 */
package org.dimigo.inheritence;

/**
 * <pre>
 * org.dimigo.inheritence
 *     |_ Triangle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class Triangle extends figure{
	
	int width;
	int height;
	
	public Triangle (int width, int height) {
		super(0,0);
		this.width=width;
		this.height=height;
	}
	
	public Triangle (int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width=width;
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	protected void printCenter(){
		System.out.print("삼각형의");
		super.printCenter();
	}
	
	protected double calcArea() {
		return width*height*0.5;
	}


}
