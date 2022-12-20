package class1;
/* 
 * 2022/12/20
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Bj_10951_1220 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//hasNext는 boolean타입으로 반환한다
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
	}

}
