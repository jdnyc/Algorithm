package class1;
/* 
 * 2022/12/20
 * 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Bj_11720_1220 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		String N = sc.next();
		
		int sum = 0;
		for(int i=0; i<T; i++) {
			sum = sum+N.charAt(i)-'0';
		}
		
		System.out.println(sum);
	}

}
