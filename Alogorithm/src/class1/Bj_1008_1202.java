package class1;
/* 
 * 2022/12/02
 * 문제 :두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성 (소숫점까지)
 */
import java.util.Scanner;

public class Bj_1008_1202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//소숫점 까지 출력을 해야 하기 때문에 실수형 타입인 double형으로 변수 값 저장
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		//실수형 변수 a, b 나눗셈 출력
		System.out.println(a/b);
	}
}