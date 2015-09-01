/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritence
 *     |_ IPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class IPhone extends SmartPhone {
	
	public IPhone() {
		
	}
	public IPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void pay() {
		System.out.println("애플패이로 결제합니다.");		
	}
	
	void useAirDrop() {
		System.out.println("Air Drop기능을 사용합니다.");
	}

}
