/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *     |_ MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 *
 * @author			: 황진영
 * @version			: 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Music> listB = new ArrayList<Music>();
		ArrayList<Music> listD = new ArrayList<Music>();
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		
		listB.add(new Music("내 첫사랑", "베리굿"));
		listB.add(new Music("또 다시 사랑", "임창정"));
		listB.add(new Music("부산에 가면", "박진영"));
		
		map.put("발라드", listB);
		
		listD.add(new Music("커피", "유제환, 김예림"));
		listD.add(new Music("다 잘 될거야", "쿨"));
		map.put("댄스", listD);
		
		System.out.println("-----<< 멜론 장르별 차트 >>-----");
		  
		printMap(map);
		System.out.println();
		
		System.out.println("-----<< 발라드 3위 곡 변경 >>-----");
		listB.set(2, new Music("지우고 지워도", "차수경"));

		printMap(map);
		System.out.println();
		
		System.out.println("-----<< 발라드 1위 곡 삭제 >>-----");
		listB.remove(0);
		printMap(map);
		System.out.println();
		
		
		System.out.println("-----<< 전체 리스트 삭제 >>-----");
		listB.removeAll(listB);
		listD.removeAll(listD);
		map.remove("발라드");
		map.remove("댄스");
		printMap(map);
	}
	
	//+ i + ". " + map.get(key));
	
	public static void printMap(Map<String, List<Music>> map) {
		
		int i = 1;
		for(String key : map.keySet()) {
			System.out.printf("[" + key + "]" +"\n");
			for(Music value : map.get(key)) {			
				System.out.println(i + ". " + value.toString());
				i = i+1;
			}
				i=1;
		}
	}

}
