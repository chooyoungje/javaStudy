package lesson_0503;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map의 종류 : HashMap
 : 데이터를 저장할 떄 key, value 짝을 지어 저장
  데이터의 검색이 빠름

 * key는 중복(equals, hashcode)을 허용하지 않는다
 *
 */
public class Map01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] names = {"A","B","C","D","E"};
        int[] nums = {11,22,33,44,55};
        for(int i=0;i<5;i++){
            map.put(names[i],nums[i]);
        }
        System.out.println(map);

        // map.get(key), key값에 해당하는 value를 가져온다
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("C"));
        System.out.println(map.get("D"));

        // key 값들만 조회하기 Set은 중복을 허용하지 않기 때문에 Set으로 받음
        System.out.println("key 값들만 조회하기");
        Set<String> keys = map.keySet(); // 배열을 리턴한다
        for(String k : keys){
            System.out.println(k+"의 번호" + map.get(k));
        }

        // value 값들만 조회하기 => map.values
        System.out.println("value 값들만 조회하기");
        Collection<Integer> values = map.values(); // Map의 value들이 담겨있는 배열을 받는다
        for(Integer v : values){
            System.out.println(v);
        }

        // Key, value 쌍으로 조회하기 => map.entrySet();
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        for(Map.Entry<String, Integer> m : entry){
            System.out.println(m.getKey() + "키" + m.getValue());
        }
    }
}
