package contents;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C03_DateCalendar {
	public static void main(String[] args) {
		/* Date Ŭ���� - ��¥ ������ ǥ���ϴ� Ŭ���� */
		Date now = new Date();
		System.out.println(now);
		
		/* SimpleDateFormat Ŭ���� - ���ϴ� �������� ��¥ ������ ǥ�����ش� */
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY MM dd");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("YYYY�� MM�� dd�� aa hh�� mm�� ss��");
		System.out.println(sdf.format(now));
		
		/* Calendar Ŭ���� - �޷��� ǥ���ϴ� Ŭ���� */
		Calendar dal = Calendar.getInstance();
//		System.out.println(dal);
		System.out.println(dal.get(Calendar.YEAR)); //����Ÿ��
		System.out.println(dal.get(Calendar.MONTH)+1);
		System.out.println(dal.get(Calendar.DAY_OF_MONTH));
		System.out.println(dal.get(Calendar.DAY_OF_WEEK));
		System.out.println(dal.get(Calendar.AM_PM));
		System.out.println(dal.get(Calendar.HOUR));
		System.out.println(dal.get(Calendar.MINUTE));
		System.out.println(dal.get(Calendar.SECOND));
	}
}






