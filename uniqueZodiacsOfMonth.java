package Match_Your_Age_ver02;

// 월,일 을 구하여 조건에 맞는 별자리 구하기
public class uniqueZodiacsOfMonth {

	public static String yourZodiacMonth(int input) {

		int gender = (int) (input % 10); // 마지막 숫자 (성별)
		input /= 10;
		int day = (int) (input % 100); // 일 (2자리)
		input /= 100;
		int month = (int) (input % 100); // 월 (2자리)
		input /= 100;
		int year = (int) input; // 년도 (4자리)

		if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
			return "양 자리";
		} else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
			return "황소 자리";
		} else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
			return "쌍둥이 자리";
		} else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
			return "게 자리";
		} else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
			return "사자 자리";
		} else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
			return "처녀 자리";
		} else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
			return "천칭 자리";
		} else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
			return "전갈 자리";
		} else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
			return "사수 자리";
		} else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
			return "염소 자리";
		} else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
			return "물병 자리";
		} else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
			return "물고기 자리";
		} else {
			return "알 수 없음";
		}
	}
}
