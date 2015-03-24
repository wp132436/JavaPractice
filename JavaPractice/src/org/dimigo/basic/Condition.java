package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		int rjfl = 10;
		String ckfid = "고속버스";
		int xhdgodfy;
			
		
			if(rjfl <= 10) {
				xhdgodfy = 850;
			}
			else if(rjfl <=20) {
				xhdgodfy = 1150;
			}
			else {
				xhdgodfy = 1450;
			}
				
	
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 :" + rjfl + "km");
		System.out.println("차량 :" + ckfid);
		System.out.println("통행료 :" + xhdgodfy + "원");
	
	}
}


