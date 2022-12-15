package class1;
/* 
 * 2022/12/15
 * 문제 : 세 개의 자연수 A, B, C가 주어질 때 
 * 		 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성
 */
import java.util.Scanner;
public class Bj_2557_1215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int mul = A*B*C;
		
		//int를 String으로 변환
		String s = Integer.toString(mul);
		
		//0~9까지 반복
		for(int i=0; i<10; i++) {
			//개수 셀 cnt 0으로 초기화
			int cnt = 0;
			for(int j=0; j<s.length(); j++) {
				//charAt() - '0' 은 정수
				//곱한 숫자의 첫째자리부터 비교하며 cnt에 추가
				if(i==s.charAt(j)-'0') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}
}
