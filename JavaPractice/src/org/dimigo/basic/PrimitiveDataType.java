package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		//코드 수정전
		//코드 수정 후
		String name = "아이유";
		boolean tjdquf;
		tjdquf = true;
		
		
		int age = 23;
		double height = 161.8;
		float weight = (float) 44.3;
		char bloodType = 'A';
		
		System.out.println("<< 아이유 프로필>>");
		System.out.println("이름 : " + name);
		if(tjdquf) {
			  System.out.println("성별 :여자");
		  } else {
			  System.out.println("성별 : 남자"); 
		  }
		System.out.println("나이 : " + age +"세");
		System.out.println("키 : " + height +"cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + "형");
		
	}

}
