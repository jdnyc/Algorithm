package class1;
/* 
 * 2022/12/16
 * 문제 : 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오
 */
import java.util.Scanner;

public class Bj_2742_1216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//시작할 수
		int N = sc.nextInt();
		
		//시작할 수 부터 --로 1까지 반복
		for (int i = N; i > 0; i--) {
			System.out.println(i);
		}
	}

}
