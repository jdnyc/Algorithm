package class1;
/* 
 * 2022/12/03
 * 문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성
 */
import java.util.Scanner;
public class Bj_1330_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Scanner sc로 값을 받아와 정수형 변수 a, b에 값 저장
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//if문 사용해서 a값이 b보다 크면 > 출력
		if(a>b) {
			System.out.println(">");
		} 
		//a값이 b보다 작으면 < 출력
		else if(a<b) {
			System.out.println("<");
		} 
		//a값이 b와 같으면 == 출력
		else if(a==b) {
			System.out.println("==");
		}
	}
}
