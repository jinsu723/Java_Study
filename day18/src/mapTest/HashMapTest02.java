package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

// 2번 : HashMap

public class HashMapTest02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.println(map);
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		System.out.println(map);
		
		map.put("e", 1);  // key는 중복 불가능, value는 중복 가능
		System.out.println(map);
		System.out.println(map.get("d"));  // "d"에 저장돼있는 값 호출
		
		System.out.println("크기 : " + map.size());
		System.out.println(map.keySet());  // iterator가 있어서 차례대로 나온다
		System.out.println(map.values());  // iterator가 있어서 차례대로 나온다
		
		HashMap<String, Integer> mart = new HashMap<>();
		// 추가 put()
		mart.put("새우깡", 2200);
		mart.put("빼빼로", 2000);
		mart.put("포카칩", 2500);
		mart.put("양파링", 2900);
		
		// 조회 get(key)
		System.out.println("조회 : " + mart.get("새우깡"));
		System.out.println("조회 : " + mart.get("양파깡"));
		
		// 삭제 remove(key)
		System.out.println("삭제 : " + mart.remove("빼빼로"));
		System.out.println(mart);
		
		// 길이 size()
		System.out.println("길이 : " + mart.size());
		
		// key에 포함되어 있는지 확인 containsKey
		// Value에 포함되어 있는지 확인 comtainsValue
		System.out.println("key에 포카칩이 있는지 확인 : " + mart.containsKey("포카칩"));
		System.out.println("value에 1000이 있는지 확인 : " + mart.containsValue("1000"));
		
		// Iterator
		// keySet -> key만 가져오기
		System.out.println("key만 가져오기 : " + mart.keySet());
		Iterator<String> iter = mart.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println("key를 개별로 조회하기 : " + iter.next());
		}
	
		// value에서 value만 가져오기
		System.out.println(mart.values());
		Iterator<Integer> iter2 = mart.values().iterator();
		System.out.println(iter2);
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		// Entry key, value한 쌍씩 가져오기
		Set<Entry<String, Integer>> items = mart.entrySet();
		for(Entry<String, Integer>entry : items) {
			 System.out.println(entry);
		}
	}
}
