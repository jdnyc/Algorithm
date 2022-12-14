package class1;
/* 
 * 2022/12/14
 * 문제 : 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class Bj_9306_1214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			String s = sc.next();
			
			//charAt으로 문자열의 첫번째 글자 추출하여 출력
			System.out.print(s.charAt(0));
			//문자열의 길이-1로 마지막 글자 추출하여 출력
			System.out.println(s.charAt(s.length()-1));
		}
	}
}
