package class1;
/* 
 * 2022/12/22
 * 문제 : 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 
 * 		 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 		 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
 * 		 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 */
import java.util.Scanner;

public class Bj_2577_1222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[10];
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int mul = A*B*C;
		//곱셈 정수를 문자열로 변환
		String N = Integer.toString(mul);
		
		//해당 숫자의 배열 요소는 +1씩 하여 셈을 더해줌
		for(int i=0; i<N.length(); i++) {
			num[N.charAt(i)-'0']++;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
