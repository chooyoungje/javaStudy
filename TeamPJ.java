package ch17_stream;

public class TeamPJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Footballplayer[] stuArr = {
		new Footballplayer("요앙 구르퀴프", "프랑스", 186, "오른발", "미드필더", 8.5, 37, "디종 FCO", 1992),
		new Footballplayer("디르크 카윗", "네덜란드", 183, "오른발", "공격수", 7.7, 43, "퀵 보이스", 1998),
		new Footballplayer("엠마누엘 아데바요르", "토고", 193, "오른발", "공격수", 6.5, 40, "AC 세마시 FC", 2001),
		new Footballplayer("프랑크 리베리", "프랑스", 170, "오른발(양발)", "공격수", 9.5, 41, "US 살레르니타나 1919", 2000),
		new Footballplayer("크리스티아누 호날두", "포르투갈", 187, "오른발(양발)", "공격수", 10.0, 39, "알 나스르 FC", 2002),
		new Footballplayer("세르히오 라모스", "스페인", 184, "오른발", "수비수", 9.9, 38, "세비야 FC", 2003),
		new Footballplayer("레프 야신", "러시아", 189, "오른발", "골키퍼", 10.0, 60, "FC 디나모 모스크바", 1949),
		new Footballplayer("이동경", "대한민국", 175, "왼발", "미드필더", 10.0, 26, "김천상무", 2018),
		new Footballplayer("정재희", "대한민국", 174, "오른발", "미드필더", 6.5, 30, "포항스틸러스", 2016),
		new Footballplayer("이상헌", "대한민국", 178, "오른발", "미드필더", 5.5, 26, "강원FC", 2017),
		new Footballplayer("박청효", "대한민국", 190, "오른발", "골키퍼", 1.5, 33, "강원FC", 2013),
		new Footballplayer("린가드", "영국", 175, "오른발", "미드필더", 8.0, 31, "서울FC", 2011),
		new Footballplayer("황희찬", "대한민국", 177, "오른발", "공격수", 7.5, 28, "울버햄튼", 2009),
		new Footballplayer("백승호", "대한민국", 182, "오른발", "미드필더", 6.5, 27, "버밍엄 시티", 2016),
		new Footballplayer("엘링 홀란드", "잉글랜드", 195, "왼발", "공격수", 8.2, 23, "맨체스터 시티", 2015),
		new Footballplayer("카일 워커", "영국", 183, "오른발", "수비수", 4.1, 33, "맨체스터 시티", 2008),
		new Footballplayer("버질 반 다이크", "네덜란드", 195, "오른발", "수비수", 4.2, 32, "리버풀", 2011)
	            
	     
	         };
	}

}
	
class Footballplayer {
   String name; // 이름
   String nationality; // 국적
   int height; // 키
   String foot; // 주발
   String position; // 포지션
   double score; // 평점(10점만점)
   int age; // 나이
   String team; //소속팀
   int year; // 데뷔년도
   
   Footballplayer(String name, String nationality, int height, String foot,String position, double score,
		   int age, String team,  int year) { 
      this.name = name;
      this.nationality = nationality;
      this.height = height;
      this.foot = foot;
      this.position = position;
      this.score = score;
      this.age = age;
      this.team = team;
      this.year = year;
}
   
}

