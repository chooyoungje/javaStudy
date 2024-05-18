package lesson_0503;


/*
Hashtable : 동기화 (synchronized) 되어있음, Null 허용 하지 않음
*/

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<>();
        hm.put(100,"A");
        hm.put(101,"B");
        hm.put(102,null); // NullPointerException 에러
        hm.put(103,"C");
        System.out.println(hm);
    }
}

