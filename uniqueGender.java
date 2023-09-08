package Match_Your_Age_ver02;

// 홀수/짝수 를 통해 남/여 구분하기
public class uniqueGender {
	
	public static String yourGender(int uniqueGender) {
		
		if (uniqueGender % 2 ==0) {
			String gender = "여 자";
			return gender;
		} else {
			String gender = "남 자";
			return gender;
		}
	}

}
