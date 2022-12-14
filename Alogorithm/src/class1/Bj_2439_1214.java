package class1;
/* 
 * 2022/12/14
 * 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 	 	 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 */
import java.util.Scanner;
public class Bj_2439_1214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			//N-i만큼 공백을 넣음
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			//공백후 남은 공간을 *로 채움
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
