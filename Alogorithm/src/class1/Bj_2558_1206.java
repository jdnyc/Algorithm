package class1;
/* 
 * 2022/12/06
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class Bj_2558_1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//계산할 정수 A, B를 저장할 변수 선언
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
	}
}
