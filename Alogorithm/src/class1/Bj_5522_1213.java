package class1;
/* 
 * 2022/12/13
 * 문제 :  이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
 * 		  JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, 
 * 		  JOI군의 총점을 구하는 프로그램을 작성
 */

import java.util.Scanner;

public class Bj_5522_1213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//점수의 총 합을 더할 sum 선언
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			int A = sc.nextInt();
			
			//득점 정수가 0이상 100이하이기에 조건문 입력
			if(A>=0&&A<=100) {
				sum = sum+A;
			}
		}
		
		System.out.println(sum);
	}
}