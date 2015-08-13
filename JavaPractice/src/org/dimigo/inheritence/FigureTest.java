/**
 * 
 */
package org.dimigo.inheritence;

/**
 * <pre>
 * org.dimigo.inheritence
 *     |_ FigureTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class FigureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		System.out.println("원의 넓이 : " + String.format("%.1f", c.calcArea()));
			
		
		Triangle t = new Triangle(10,10,5, 8);
		System.out.println("삼각형의 넓이 : " + String.format("%.1f", t.calcArea()));
		
		
		
		Rectengle r = new Rectengle(20,20,5, 8);
		System.out.println("사각형의 넓이 : " + String.format("%.1f", r.calcArea()));
		
		
		System.out.println();
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		c.moveCenter(5, 5);
		r.moveCenter(5, 5);
		t.moveCenter(5, 5);
		
		System.out.println();
		System.out.println("--중심좌표 이동 x, y축으로 5씩");
		System.out.println();
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		

	}

}
