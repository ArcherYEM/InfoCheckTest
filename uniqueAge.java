package Match_Your_Age_ver02;

import java.util.Calendar;

// Calendar 를 통해 올해 연도나이 구하기
public class uniqueAge {

	static Calendar calendar = Calendar.getInstance();
	static int nowYear = calendar.get(Calendar.YEAR);

	public static int yourAge(int uniqueAge) {
		while (uniqueAge > 10000) {
			uniqueAge /= 10;
		}
		
		if(uniqueAge > 0) {
			return nowYear - (uniqueAge - 1 );
		} else {
			return nowYear - uniqueAge;
		}
	}
}