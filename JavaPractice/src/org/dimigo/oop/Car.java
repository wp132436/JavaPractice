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
public class Car {
	private String company;		// 회사명
	private String model;		// 모델명
	private String color;		// 색상
	private int maxSpeed;		// 최대속도
	private int price;			// 가격
	
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}	
	
	public void setCompany(String newCompany) {
		company = newCompany;
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
