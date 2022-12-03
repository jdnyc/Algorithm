package class1;
import java.math.BigInteger;
/* 
 * 2022/12/03
 * 문제 : 두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램을 작성
 * 		각각의 수는 10진수로 1,000자리를 넘지 않으며 양수와 음수가 모두 주어질 수 있다.
 */
import java.util.Scanner;
public class Bj_2338_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1000자리 수는 범위가 크기 때문에 BigInteger로 변수 선언
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		/*
		 * BigInteger 계산은 
		 * 덧셈은 add
		 * 뺄셈은 subtract
		 * 곱셈은 multiply
		 */
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));
	}
}
