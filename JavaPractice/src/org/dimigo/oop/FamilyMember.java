/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 *
 * @author			: 황진영 
 * @version			: 1.0
 */
public class FamilyMember {
	private static int memberCnt = 0 ;
	private String memberName;
	
	
	/**
	 * @param string
	 */
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}

	

	public String getMemberName() {
		return memberName;
	}
	
	public void  printMember() {
		System.out.println("가족 총 인원 수  : " +  memberCnt + "명");
	}
	
	
	
}
