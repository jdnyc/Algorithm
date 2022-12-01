package class1;
/* 
 * 2022/12/01
 * 문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성
 */

import java.util.Scanner;

public class Bj_1000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Scanner sc로 값을 받아와 a, b변수에 값 저장
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//변수 a, b의 합 출력
		System.out.println(a+b);
		
	}
}