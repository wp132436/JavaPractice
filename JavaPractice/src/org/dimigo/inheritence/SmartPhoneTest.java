/**
 * 
 */
package org.dimigo.inheritence;

/**
 * <pre>
 * org.dimigo.inheritence
 *     |_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone I = new IPhone("iPhone 6", "애플", 700000);
		I.toString();
		IPhone J = (IPhone) I;
		I.turnOn();
		J.pay();
		J.useAirDrop();
		I.turnOff();
		System.out.println();
		
		SmartPhone G = new Galaxy("갤럭시 S6", "삼성", 650000);
		G.toString();
		Galaxy H = (Galaxy) G;
		H.turnOn();
		H.pay();
		H.useWireless();		
		G.turnOff();

	}

}
