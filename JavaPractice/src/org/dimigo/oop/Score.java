/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ Score
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("국어 점수 입력 => ");
		Scanner scanner = new Scanner(System.in);
		int kor = scanner.nextInt();
		
		System.out.println("수학 점수 입력 => ");
		Scanner scanner1 = new Scanner(System.in);
		int mat = scanner1.nextInt();
		
		System.out.println("영어 점수 입력 => ");
		Scanner scanner2 = new Scanner(System.in);
		int eng = scanner2.nextInt();
		int total = kor + mat + eng;
		int avg = total / 3;
		
		System.out.println("<< 점수 출력>>");
		
		StringBuilder sb = new StringBuilder();
		sb.append("국어점수 : ")
		.append(kor + "점\n")
		.append("수학점수 : ")
		.append(mat + "점\n")
		.append("영어점수 : ")
		.append(eng + "점\n")
		.append("총점 : " + total)
		.append("\n평균 : " + avg);
		
		System.out.println(sb);

	}

}
