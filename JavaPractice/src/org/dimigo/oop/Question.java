/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("우리반 25번인 학생은?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if(answer.equals("윤하연")) {
			System.out.println("정답입니다!!");
		} else {
			System.out.println("틀렸습니다!!");
		}
		
		System.out.println("우리반 21번인 학생은?");
		Scanner scanner1 = new Scanner(System.in);
		String answer1 = scanner.nextLine();
		if(answer1.equals("우준하")) {
			System.out.println("정답입니다!!");
		} else {
			System.out.println("틀렸습니다!!");
		}
		
		System.out.println("우리반 20번인 학생은?");
		Scanner scanner2 = new Scanner(System.in);
		String answer2 = scanner.nextLine();
		if(answer2.equals("어경빈")) {
			System.out.println("정답입니다!!");
		} else {
			System.out.println("틀렸습니다!!");
		}
		
	}

}
