package class1;
/* 
 * 2022/12/19
 * 문제 : 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
 * 		 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Bj_10871_1219 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int A = sc.nextInt();
		
		//정수 X개로 이루어진 배열 N
		int [] N = new int[X];
		
		//배열에 숫자 입력
		for(int i=0; i<N.length; i++) {
			N[i] = sc.nextInt();
		}
		
		//입력된 숫자 A와 비교하여 A보다 작은 N[i]는 출력
		for(int i=0; i<N.length; i++) {
			if(A>N[i])
				System.out.print(N[i]+" ");
		}	
	}

}
