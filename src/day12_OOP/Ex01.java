package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		long time= System.currentTimeMillis();
		System.out.println(time);

		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");
		//이게 틀을 만드는 것임
		//그 틀에다가 이 시간을 넣어줄것임.
		//yyyy년 MM월 dd일 aa hh 시 mm분 ss초
		
		String str = s.format(time);
		System.out.println(str);
		
		Date d = new Date();
		System.out.println("date"+d);
		System.out.println("format(d): "+s.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal: "+cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);//0~11까지 있어서 +1헤야함
		System.out.println(cal.get(Calendar.DATE));
	}

}
