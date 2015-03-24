package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		int rjfl = 30;
		String ckfid = "경차";
		int xhdgodfy = 0;
			
		
		switch (ckfid) {
		case "고속버스" :
			if(rjfl <= 10) {
				xhdgodfy = 850;
			}
			else if(rjfl <=20) {
				xhdgodfy = 1150;
			}
			else if(rjfl <= 30) {
				xhdgodfy = 1450;
			}
			else { 
				xhdgodfy = 850 + ((rjfl-10)/10) * 300;
			}
			break;
		
		case "경차" :
				if(rjfl <= 10) {
					xhdgodfy = 300;
				}
				else if(rjfl <=20) {
					xhdgodfy = 500;
				}
				else {
					xhdgodfy = 700;
				}
			break;
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 :" + rjfl + "km");
		System.out.println("차량 :" + ckfid);
		System.out.println("통행료 :" + xhdgodfy + "원");
	
	}
}


