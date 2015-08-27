/**
 * 
 */
package org.dimigo.inheritence;

/**
 * <pre>
 * org.dimigo.inheritence
 *     |_ Galaxy
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class Galaxy extends SmartPhone{
	
	public Galaxy() {
		
	}
	public Galaxy (String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	void pay() {
		System.out.println("삼성페이로 결제합니다.");
	}
	
	void useWireless() {
		System.out.println("무선충전 기능을 사용합니다.");
	}

}
