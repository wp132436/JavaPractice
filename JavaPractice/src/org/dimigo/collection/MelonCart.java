/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;

/**
 * <pre>
 * org.dimigo.collection
 *     |_ MelonCart
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class MelonCart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Music> list = new ArrayList<Music>();
		
		
		list.add(new Music("바람이나 좀 쐬", "개리"));
		list.add(new Music("보통 연애", "박경"));
		list.add(new Music("취향저격", "KON"));
		
		System.out.println("-<<멜론 차트>>-");
		printList(list);
		System.out.println();
		
		System.out.println("-<<2위 곡 추가>>-");
		list.add(1, new Music("레옹", "이유갓지"));
		printList(list);
		System.out.println();
		
		System.out.println("-<<3위 곡 변경>>-");
		list.add(2, new Music("맙소사", "황태지"));
		list.remove(3);
		printList(list);
		System.out.println();
		
		System.out.println("-<<4위곡 삭제>>-");
		list.remove(3);
		printList(list);
		System.out.println();
		
		System.out.println("-<<전체 곡 삭제>>-");
		list.removeAll(list);
		printList(list);
		
		
	}
	
	public static void printList(ArrayList<Music> list) {
		int i=1;
		for(Music value : list) {			
			System.out.println(i + ". " + value.toString());
			i = i+1;
		}
	}

}
