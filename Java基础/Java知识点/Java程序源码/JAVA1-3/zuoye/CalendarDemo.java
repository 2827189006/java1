import java.sql.Date;
import java.util.Calendar;


public class CalendarDemo {
	public static void main(String[] args) {
		Calendar ca=Calendar.getInstance();
		System.out.println("year is:"+ca.get(Calendar.YEAR));
		ca.add(Calendar.YEAR, 2);
		System.out.println("year is:"+ca.get(Calendar.YEAR));
		ca.set(Calendar.YEAR, 2009);
		System.out.println("year is:"+ca.get(Calendar.YEAR));
		System.out.println("day of year:"+ca.get(Calendar.DAY_OF_YEAR));
		System.out.println("day of week:"+ca.get(Calendar.DAY_OF_WEEK));
		Date date=ca.getTime();
		System.out.println("date time:"+date.getTime());
		System.out.println("calendar time:"+ca.getTimeInMillis());
	}
	

}
