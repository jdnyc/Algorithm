package class1;
/* 
 * 2022/12/21
 * 문제 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 		 단, 대문자와 소문자를 구분하지 않는다.
 */
import java.util.Scanner;

public class Bj_1157_1222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		//영문자 개수는 26개
		//0부터 a를 순서대로 저장
		int arr[] = new int[26];
		
		/*
		 * 대문자 = 65~90
		 */
		for(int i=0; i<S.length(); i++) {
			if(65<=S.charAt(i)&&S.charAt(i)<=90) {
				arr[S.charAt(i)-65]++;
			}
			else {
				//소문자는 97부터이기에 97을 빼줌
				arr[S.charAt(i)-97]++;
			}
		}
		
		//0이면 a가 제일 큰게 되므로 -1
		int max = -1;
		char ch = '?';
		 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			//같은 숫자면 '?' 출력
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
	}

}
