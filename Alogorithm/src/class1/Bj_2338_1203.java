package class1;
import java.math.BigInteger;
/* 
 * 2022/12/03
 * ���� : �� �� A, B�� �Է¹޾�, A+B, A-B, A��B�� ���ϴ� ���α׷��� �ۼ�
 * 		������ ���� 10������ 1,000�ڸ��� ���� ������ ����� ������ ��� �־��� �� �ִ�.
 */
import java.util.Scanner;
public class Bj_2338_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1000�ڸ� ���� ������ ũ�� ������ BigInteger�� ���� ����
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		/*
		 * BigInteger ����� 
		 * ������ add
		 * ������ subtract
		 * ������ multiply
		 */
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));
	}
}
