package lesson_0503;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 * Properties 클래스 Hashtable의 하위 클래스임.
 * Hashtable은 Map 인터페이스의 구현 클래스이므로 Properties
 * 클래스도 Map을 구현한 클래스다.
 * (key,value) 자료형이 모두 String임. 제넥릭표현은 안한다.
 * - 텍스트파일에 Properties 객체를 추가할 수 있는 기능이 있다.
 */

/*
* Properties
* Hashtable을 상속받아 구현한 것으로,
* Hashtable은 키와 값을 (Object, Object)의 형태로 저장하는데 비해
* Properties는 (String, String)형태로 저장하는 보다 단순화된 컬렉션 클래스이다.

  주로 애플리케이션의 환경설정과 관련된 속성을 저장하는데 사용되며
* 데이터를 파일로부터 읽고 쓰는 편리한 기능을 제공한다.
*
* 그래서 간단한 입출력은 Properties를 활용하면 몇 줄의 코드로 쉽게 해결할 수 있다.
* 파일을 직접 생성하지는 못하므로 FileOutputStream 또는 FileWriter로 파일 생성
* DB의 연결정보 등을 저장해두는 용도로 많이 쓰임
* */
public class Properties01 {
    public static void main(String[] args) throws Exception {
        Properties pr = new Properties();
        System.out.println(pr);

        //a.properties 파일을 지정 => 읽을 준비 완료
        FileInputStream fis = new FileInputStream("src/lesson_0503/a.properties");
        pr.load(fis); // 파일 정보를 읽어서 프로퍼티 객체에 넣기
        System.out.println(pr);

        // pr.get("name") => 키가 name인 객체의 밸류를 리턴한다
        System.out.println(pr.get("name"));
        System.out.println(pr.get("web"));

        // pr.getProperty => 프로퍼티는 String만 쓰기 때문에  프로퍼티를 쓸 때에는 이걸 써야한다
        // pr.get => 객체 리턴
        // pr.getProperty => String 리턴,
        System.out.println(pr.getProperty("name"));
        // 프로퍼티에 새로운 객체 집어넣기
        pr.put("subject","컴퓨터공학");
        System.out.println(pr);

        // FileOutputStream : 파일 생성하기.
        FileOutputStream fos = new FileOutputStream("src/lesson_0503/b.properties");
        
        // pr 객체의 (key, value) 객체를 파일로 생성
        pr.store(fos,"#save");
        // 파일에 주석을 달 수도 있다
    }
}
