package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 키보드를 통해 학생 수와 각 학생들의 점수를 입력받고
		 * 최고, 최소 점수 및 평균 점수를 출력하는 프로그램을 작성하세요
		 */
		Scanner sc = new Scanner(System.in);
		int[] score = null;
		while(true) {
			System.out.println("---------------------------------------------------");
			System.out.println("| 1.학생 수 | 2.점수 입력 | 3.점수 확인 | 4.분석 | 5.종료 |");
			System.out.println("---------------------------------------------------");
			System.out.print(">> ");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.print("학생 수 : ");
				int studentNum = sc.nextInt();
				score = new int[studentNum];
				continue;
			} else if (menu == 2) {
				System.out.println("[ 학생들의 점수 입력 ]");
				for(int i = 0; i < score.length; i++) {
					System.out.print(i+1 + "번 학생 점수 : ");
					score[i] = sc.nextInt();
				}
				continue;
			} else if (menu == 3) {
				System.out.println("[ 학생들의 점수 확인 ]");
				for(int i = 0; i < score.length; i++) {
					System.out.println(i+1 + "번 학생 점수 : " + score[i]);
				}
				continue;
			} else if (menu == 4) {
				System.out.println("[ 학생들의 점수 분석 ]");
				int max = score[0];
				int min = score[0];
				int sum = 0;
				for(int i =0; i < score.length; i++) {
					if (score[i] > max) {
						max = score[i];
					}
					if (score[i] < min) {
						min = score[i];
					}
					sum = sum + score[i];
				}
				double avr = (double) sum / score.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("최소 점수 : " + min);
				System.out.println("평균 점수 : " + avr);
				continue;
			} else if (menu == 5) {
				System.out.println("[ 프로그램 종료 ]");
				break;
			}
		}
	}
}
