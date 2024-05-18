package lesson_0503;

/*HashMap을 Iterator로 수정하여 프린트한다
 * Collection : co.iterator();
 * Set:  set.iterator()
 * List: li.iterator()
 * Map  --->  Iterator;
 * Map -> Set: keySet() -> iterator()
 * Map -> Set: entrySet() ->iterator()
 * Map -> Collection : values() -> iterator()
 * * */

import java.util.*;

public class IteratorMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",11);
        map.put("B",22);
        map.put("C",33);
        map.put("D",44);
        System.out.println("총 Entry 수 : " + map.size()); // 맵의 크기 구하기

        // 키값으로 값 불러오기
        System.out.println("\t A : "+map.get("A"));

        // map.keySet() 으로 iterator 만들기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        System.out.println("map.keySet");
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }

        // map.entrySet 으로 iterator 만들기
        System.out.println("map.entrySet");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
        while(entryIt.hasNext()){
            Map.Entry<String, Integer> en = entryIt.next();
            System.out.println(en.getKey() + " : "+en.getValue());
        }

        // map.values() 으로 iterator 만들기
        System.out.println("map.values()");
        Collection<Integer> c = map.values();
        Iterator<Integer> valueIterator = c.iterator();
        while(valueIterator.hasNext()){
            Integer value = valueIterator.next();
            System.out.println(value);
        }
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
