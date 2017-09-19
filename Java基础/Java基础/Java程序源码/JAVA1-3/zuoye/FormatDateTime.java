package 练习;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class FormatDateTime {
	public static String toLongDateString(Date dt){
      SimpleDateFormat myFmt=new SimpleDateFormat();
  return myFmt.format(dt);
	}
	public static String toShortDateString(Date dt){
		 SimpleDateFormat myFmt=new SimpleDateFormat("yy 年 MM 月 dd 日  HH 时 mm分");
		 return myFmt.format(dt);
	}
	public static String toLongTimeString(Date dt){
		 SimpleDateFormat myFmt=new SimpleDateFormat("  HH MM ss SSSS");
		 return myFmt.format(dt);
}
	public static String toShortYimeString(Date dt){
		 SimpleDateFormat myFmt=new SimpleDateFormat("yy/MM/dd/HH/mm");
		 return myFmt.format(dt);
	}
	public static void main(String[] args) {
		Date now=new Date(0);
		System.out.println(FormatDateTime.toLongDateString(now));
		System.out.println(FormatDateTime.toShortDateString(now));
		System.out.println(FormatDateTime.toLongDateString(now));
		System.out.println(FormatDateTime.toShortDateString(now));
	}
}