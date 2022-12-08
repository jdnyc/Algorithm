package class1;
/* 
 * 2022/12/08
 * 문제 : 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Bj_2741_1208 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//1부터 N까지 1씩 증가하며 출력
		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
	}

}
