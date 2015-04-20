/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 7.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class Car2 {

	private String company;
	private  String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2 () {
	
	}
	public Car2(String newcompany, String newmodel, String newcolor, int newMaxSpeed, int newPrice) {
		company = newcompany;
		model = newmodel;
		color = newcolor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
	public boolean forward(int speed){
		System.out.println(speed + "만큼 전진");
		return true;
	}
	
	public boolean backward(int speed){
		System.out.println(speed + "만큼 후진");
		return true;
	}
	
	public boolean stop() {
		System.out.println("멈춥니다");
		return true;
	}
	
	public boolean turnLeft(int angle) {
		System.out.println(angle + "만큼 좌회전");
		return true;
	}
	
	public boolean turnRight(int angle) {
		System.out.println(angle + "만큼 우회전");
		return true;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}



