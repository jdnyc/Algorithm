package class1;
/* 
 * 2022/12/22
 * 문제 : 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 
 * 		 이를 구하는 프로그램을 작성하시오. 
 * 		 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 */

import java.util.Scanner;

public class Bj_1152_1222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		//문자열 공백 제거
		s=s.trim();
		//" "로 구분하여 문자열을 나누어 배열에 저장
		String[] arr = s.split(" ");
		if(s.isEmpty()) {
			//s가 공백이면 0 출력
			System.out.println(0);
		} else {
			System.out.println(arr.length);
		}
	}
}