package Match_Your_Age_ver02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년월일 8자리와 뒤 첫자리를 이어서 입력하시오.");
		System.out.println("남성은 뒷자리가 1, 여성은 뒷자리가 2 입니다");
		System.out.println("(예시) 199408301 | (예시)200105032");
		System.out.println();
		System.out.print("입력 : ");
		int enteredYourUnique = sc.nextInt();
		
		// 메소드 호출
		int year = uniqueNumber.yourYear(enteredYourUnique);
		String month = uniqueNumber.yourMonth(enteredYourUnique);
		String date = uniqueNumber.yourDate(enteredYourUnique);
		String gender = uniqueGender.yourGender(enteredYourUnique);
		int age = uniqueAge.yourAge(enteredYourUnique);
		String zodiacYear = uniqueZodiacsOfYear.yourZodiac(enteredYourUnique);
		String zodiacMonth = uniqueZodiacsOfMonth.yourZodiacMonth(enteredYourUnique);
		
		System.out.println();
		System.out.println(" ★☆★☆★☆★☆[개인정보]★☆★☆★☆★☆★");
		System.out.println(" ☆ 출생 년도 : " + year + "년 " 
							+ month + "월 " + date + "일 ★");
		System.out.println(" ★ 성별/나이 : " + gender + " /   " + age + "세   ☆");
		System.out.println(" ☆ 띠/별자리 : " + zodiacYear + " 띠 / " + zodiacMonth + "  ★");
		System.out.println(" ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		
		sc.close();
	}

}
