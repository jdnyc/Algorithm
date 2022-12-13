package class1;
/* 
 * 2022/12/13
 * 문제 :  교수님이 내준 특별과제를 28명이 제출했는데, 
 * 		  그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성
 */

import java.util.Scanner;

public class Bj_5597_1213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[31];
		
		//입력은 총 28개이기에 1부터 28까지
		for(int i=1; i<29; i++) {
			int clear = sc.nextInt();
			//제출자 구분을 위해 제출한 사람은 배열 요소에 1을 넣어준다
			student[clear]=1;
		}
		
		for(int i=1; i<student.length; i++) {
			//구분한 1이 없으면 그 사람은 제출을 안한 것이기에 출력
			if(student[i]!=1) {
				System.out.println(i);
			}
		}
		
	}
}