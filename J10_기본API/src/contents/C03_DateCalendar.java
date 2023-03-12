package contents;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C03_DateCalendar {
	public static void main(String[] args) {
		/* Date 클래스 - 날짜 정보를 표현하는 클래스 */
		Date now = new Date();
		System.out.println(now);
		
		/* SimpleDateFormat 클래스 - 원하는 형식으로 날짜 정보를 표현해준다 */
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY MM dd");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("YYYY년 MM월 dd일 aa hh시 mm분 ss초");
		System.out.println(sdf.format(now));
		
		/* Calendar 클래스 - 달력을 표현하는 클래스 */
		Calendar dal = Calendar.getInstance();
//		System.out.println(dal);
		System.out.println(dal.get(Calendar.YEAR)); //정수타입
		System.out.println(dal.get(Calendar.MONTH)+1);
		System.out.println(dal.get(Calendar.DAY_OF_MONTH));
		System.out.println(dal.get(Calendar.DAY_OF_WEEK));
		System.out.println(dal.get(Calendar.AM_PM));
		System.out.println(dal.get(Calendar.HOUR));
		System.out.println(dal.get(Calendar.MINUTE));
		System.out.println(dal.get(Calendar.SECOND));
	}
}






