/**
 * 
 */
package org.dimigo.inheritence;

/**
 * <pre>
 * org.dimigo.inheritence
 *     |_ Rectengle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class Rectengle extends Figure{
	
	int width;
	int height;
	
	public Rectengle(int width, int height) {
		super(0,0);
		this.width=width;
		this.height=height;
	}
	
	public Rectengle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width=width;
		this.height=height;
	}

	protected void printCenter(){
		System.out.print("사각형의");
		super.printCenter();
	}
	
	protected double calcArea() {
		 return width*height;
	}


}
