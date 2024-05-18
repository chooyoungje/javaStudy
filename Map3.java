package lesson_0503;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map3 {
    static HashMap<String, Map<String,String>> phoneBook = new HashMap<>();
    //            groupName,   (이름   전화번호)
    public static void main(String[] args) {
        addPhoneNo("친구", "이자바", "010-111-1111");
        addPhoneNo("친구", "김자바", "010-222-2222");
        addPhoneNo("친구", "김자바", "010-333-3333");
        addPhoneNo("회사", "김대리", "010-444-4444");
        addPhoneNo("회사", "김대리", "010-555-5555");
        addPhoneNo("회사", "박대리", "010-666-6666");
        addPhoneNo("회사", "이과장", "010-777-7777");
        addPhoneNo("세탁", "010-888-8888");
        System.out.println(phoneBook);

        printList();
    }

    // 매개변수가 3개
    public static void addPhoneNo(String groupName, String name, String phoneNum){
        addGroup(groupName);
        HashMap<String, String> group = (HashMap) phoneBook.get(groupName);
        group.put(name,phoneNum);
    }

    // 메소드 오버라이딩, 매개변수가 2개
    public static void addPhoneNo(String name, String phoneNum){
        addPhoneNo("기타",name,phoneNum);
    }

    public static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName)){
            // 중복되는 키값이 없다면
            phoneBook.put(groupName, new HashMap<String, String>());
        }
    }

    public static void printList(){
        // 키들을 전부 배열로 가져오기
        Set<String> keys = phoneBook.keySet();
        for(String key:keys){
            System.out.println("*"+key+"*");
            Map<String, String> subMaps = phoneBook.get(key);
            // key값으로 (이름, 전화번호) map 형식으로 가져오기
            for(String subMapKey : subMaps.keySet()){
                System.out.println(subMapKey+" : "+subMaps.get(subMapKey));
            }
        }

        // entrySet을 이용한 출력
        System.out.println("entrySet을 이용해 Map 출력하기");
        Set<Map.Entry<String,Map<String, String>>> phoneEntry = phoneBook.entrySet();
        for(Map.Entry<String, Map<String,String>> e : phoneEntry){
            //        groupName     name, phoneNum
            System.out.println("*"+e.getKey()+"*");
            Map<String,String> subMaps2 = e.getValue();
            for(String key :subMaps2.keySet()){
                System.out.println(key + ":" + subMaps2.get(key));
            };
        }
    }
}
