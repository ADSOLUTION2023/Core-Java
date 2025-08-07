package in.co.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHandling {
	public static void main(String[] args) throws ParseException {
		//CONVERT DATE TO STRING
		Date date = new Date();
		System.out.println("Default Format :" + date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyy.MMMMM.dd GGG hh:mm aaa");
		String formatedDate = sdf.format(date);
		System.out.println("New Format :" + formatedDate);
		System.out.println("------------------------------");
		//CONVERT STRING INTO DATE
		String dob = "1986-10-19";
		System.out.println("String DOB :-" + dob);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date dateDob = sdf1.parse(dob);
		System.out.println("Date DOB :" + dateDob);
	}

}
