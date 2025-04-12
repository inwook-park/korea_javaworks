package methods;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		//Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		//날짜와 시간
		System.out.println(cal.getTime());
		
		//현재 시간 - 1970년 1월 1일 자정 이후부터 현재까지 시간을 밀리초로 표기
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeInMillis()/(24*60*60*1000)/365);
		
		//날짜 - 년, 월, 일
		int year = cal.get(Calendar.YEAR); // 상수 표기 - YEAR
		System.out.println(year);
		int month = cal.get(Calendar.MONTH) +1;
		System.out.println(month +"월");
		
		//시간 - 시, 분, 초
 		int hour = cal.get(Calendar.HOUR);
 		System.out.println(hour + "시");
 		
 		int minute = cal.get(Calendar.MINUTE);
 		System.out.println(minute + "분");
 		
 		int second = cal.get(Calendar.SECOND);
 		System.out.println(second +"초");
 		
 		int day = cal.get(Calendar.DAY_OF_WEEK);
 		System.out.println(day);
 		
 		String[] days = new String[] {"일","월","화","수","목","금","토","일"};
 		System.out.println(days[day-1]);
 		System.out.println();
		
 		

	}

}
