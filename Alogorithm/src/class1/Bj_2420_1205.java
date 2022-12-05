package class1;
/* 
 * 2022/12/05
 * 문제 : 첫째 줄에 두 도메인의 유명도 N과 M이 주어진다.
 * 		 첫째 줄에 두 유명도의 차이 (|N-M|)을 출력한다.
 */
import java.util.Scanner;
public class Bj_2420_1205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//두 도메인의 유명도 범위가 int형 범위를 넘어가기에 long형으로 선언
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		//N-M 값이 0보다 작으면 N-M 앞에 -를 붙여준다
		if(N-M<0) {
			System.out.println(-(N-M));
		}
		//N-M 값이 0보다 크면 그냥 그대로 뺼셈을 해준다.
		else if(N-M>=0) {
			System.out.println(N-M);
		}
	}
}
