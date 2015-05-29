/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 29.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Snack[] snackArr1 = new Snack[] {new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칩", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 3)};
		
		for(Snack value : snackArr1) {
			System.out.print("상품명 : " + value.getName() + " \n"+ "회사명 : " +value.getCompany() + "\n가격 : " + value.getPrice() + "\n수량 : " + value.getNumber() + "\n");
			System.out.println();
		}
		

	}

}
