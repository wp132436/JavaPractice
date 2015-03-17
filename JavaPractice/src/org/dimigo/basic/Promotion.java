package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		long money = 1700000;
		int clerk = 3;
		int store = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>\n");
		System.out.println("월 평균 급여 : " + String.format("%,d", money));
		System.out.println("점포내 직원 수 : " + String.format("%,d", clerk));
		System.out.println("점포 수 : " + String.format("%,d", store));
		
		System.out.println("총 토탈 비용 : " + String.format("%,d", money*12*clerk*store));
		
		

	}

}
