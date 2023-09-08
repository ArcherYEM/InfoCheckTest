package Match_Your_Age_ver02;

// 12지신 배열값 저장 및 '쥐'띠 기준 4의배수 알고리즘 구현
public class uniqueZodiacsOfYear {

	static String[] zodiacs = { "쥐", "소", "범", "토끼", "용", "뱀", "말", "양", "원숭이", "닭", "개", "돼지" };

	public static String yourZodiac(int uniqueZodiac) {

		if (uniqueZodiac - 200000000 < 0) {
			while (uniqueZodiac > 10000) {
				uniqueZodiac /= 10;
			}
			int Zodiac = (uniqueZodiac - 4) % 12;
			return zodiacs[Zodiac];

		} else {
			while (uniqueZodiac > 10000) {
				uniqueZodiac /= 10;
			}
			int Zodiac = (uniqueZodiac - 4) % 12;
			return zodiacs[Zodiac];
		}

	}

}
