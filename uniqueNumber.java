package Match_Your_Age_ver02;

public class uniqueNumber {

	// 출생년도 구하기
	public static int yourYear(int uniqueYear) {
		
		if(uniqueYear - 200000000 < 0) {
			while(uniqueYear > 10000) {
				uniqueYear /= 10;
			} return uniqueYear;
		} else {
			while(uniqueYear > 10000) {
				uniqueYear /= 10;
			} return uniqueYear;
		}
		
	}
	
	// 출생월 구하기
	public static String yourMonth(int uniqueMonth) {
		
		String uniqueMonthCast = Integer.toString(uniqueMonth);
		return uniqueMonthCast.substring(4 , 6);
		 
	}
	
	// 출생일 구하기
	public static String yourDate(int uniqueDate) {
		
		String uniqueDateCast = Integer.toString(uniqueDate);
		return uniqueDateCast.substring(6 , 8);
	}
	
}
