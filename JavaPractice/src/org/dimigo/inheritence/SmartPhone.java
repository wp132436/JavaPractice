/**
 * 
 */
package org.dimigo.inheritence;

/**
 * <pre>
 * org.dimigo.inheritence
 *     |_ SmartPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class SmartPhone {
	String model;
	String company;
	int price;
	/**
	 * @param model
	 * @param company
	 * @param price
	 */
	public SmartPhone() {
		
	}
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	void useSpecialFunction(SmartPhone phone) {
		
	}
	
	public String toString() {
		return "모델명 : " + model + ", 제조사 : " + company
				+ ", 가격 : " + price + "원";
	}
	
}
