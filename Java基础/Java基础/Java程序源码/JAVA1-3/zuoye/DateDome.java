import java.util.Date;


public class DateDome {
	public static void main(String[] args) {
		Date date1=new Date();
		Date date2=new Date(1233997578421L);
		System.out.println(date1.getTime());
		System.out.println(date2.getTime());
        boolean isAfer=date1.after(date2);
		System.out.println("is date1 after date2:"+isAfer);
        date1.setTime(1133997578421L);
        isAfer=date1.after(date2);
        System.out.println("is date1 after date2:"+isAfer);
	}

}
