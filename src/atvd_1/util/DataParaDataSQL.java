package atvd_1.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataParaDataSQL {

	public static void main(String[] args) throws IllegalArgumentException {
		Date date = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		String formattedDate = simpleDateFormat.format(date);

		java.sql.Date date1 = java.sql.Date.valueOf(formattedDate);

		System.out.println("SQL Date: " + date1);
	}
}
