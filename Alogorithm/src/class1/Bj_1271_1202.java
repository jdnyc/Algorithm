package class1;
import java.math.BigInteger;
/* 
 * 2022/12/02
 * 문제 :두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성 (소숫점까지)
 */
import java.util.Scanner;

public class Bj_1271_1202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*입력 범위가 (1 ≤ m ≤ n ≤ 10^1000) 매우 크기 때문에
		 * long형의 크기를 넘는 자료형이 필요했다
		 * java.math 패키지에 있는
		 * BigInteger 클래스를 사용하면 더 큰 범위를 사용 가능 
		*/
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		
		/*
		 * BinInteger의 사칙연산은
		 * 덧셈 = n.add(m)
		 * 뺄셈 = n.subtract(m)
		 * 곱셈 = n.multiply(m)
		 * 나눗셈 = n.divide(m)
		 * 나머지 = n.remainder(m)
		 */
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
	}
}