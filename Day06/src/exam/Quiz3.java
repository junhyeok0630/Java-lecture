package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 자신의 몸무게와 키를 입력받고
		 * BMI가 저체중인지, 정상인지, 과체중인지, 비만인지 판별하는 프로그램을 작성하세요
		 * 
		 * BMI가 18.5이면 저체중
		 * BMI가 18.5 ~ 22.9 사이면 정상
		 * BMI가 23.0 ~ 24.9 사이면 과체중
		 * BMI가 25.0 이상부터는 비만
		 * BMI 공식 ) 몸무게(KG) / (신장(m) * 신장(m))
		 * 
		 * 몸무게와 키는 실수타입으로 입력받도록 하고
		 * cm => m 변환하는 법
		 * 1cm = (1/100)
		 * 872.5cm => 872.5 / 100 = 8.725m
		 */
		
		Scanner sc = new Scanner(System.in);
		double weight = 0, height = 0, BMI = 0;
		System.out.print("몸무게 입력 >> ");
		weight = sc.nextDouble();
		System.out.print("키 입력 >> ");
		height = sc.nextDouble();
		double heightM = height / 100;
		BMI = weight / (heightM * heightM);
		
		//if문으로 풀이
		if (BMI < 18.5) {
			System.out.println("BMI가 " + BMI + "이므로 저체중");
		} else if (BMI >= 18.5 && BMI < 23.0) {
			System.out.println("BMI가 " + BMI + "이므로 정상");
		} else if (BMI >= 23.0 && BMI < 25.0) {
			System.out.println("BMI가 " + BMI + "이므로 과체중");
		} else if (BMI >= 25.0) {
			System.out.println("BMI가 " + BMI + "이므로 비만");
		}
	}
}
