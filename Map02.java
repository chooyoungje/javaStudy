package lesson_0503;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/*
* HashTable
*  - HashMap과 내부 구조가 동일하며 사용 방법도 매우 비슷하다
*  - HashTable은 병렬 처리를 하면서 자원의 동기화를 할 때 주로 사용한다
* 그 외 병렬 처리를 하지 않거나 동기화를 고려하지 않을 때에는 HashMap을 주로 사용한다
*
* */
public class Map02 {
    public static void main(String[] args) {
        Map<String,String> mapTable = new Hashtable<String, String>();
        mapTable.put("Spring","12");
        mapTable.put("Summer","123");
        mapTable.put("Fall", "1234");
        mapTable.put("Winter","12345");
        System.out.println(mapTable);

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("아이디를 입력해주세요");
            String id = sc.next();
            System.out.println("비밀번호를 입력해주세요");
            String pw = sc.next();
            if(!mapTable.containsKey(id)){
                // 아이디가 없다면
                System.out.println("존재하지 않는 아이디입니다");
            } else {
                if(mapTable.get(id).equals(pw)){
                    // 비밀번호가 일치한다면
                    System.out.println("로그인 되었습니다");
                    break;
                } else{
                    System.out.println("비빌번호가 틀렸습니다");
                }
            }
        }
    }
}
