package class1;
import java.math.BigInteger;
/* 
 * 2022/12/02
 * ���� :�� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ� (�Ҽ�������)
 */
import java.util.Scanner;

public class Bj_1271_1202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*�Է� ������ (1 �� m �� n �� 10^1000) �ſ� ũ�� ������
		 * long���� ũ�⸦ �Ѵ� �ڷ����� �ʿ��ߴ�
		 * java.math ��Ű���� �ִ�
		 * BigInteger Ŭ������ ����ϸ� �� ū ������ ��� ���� 
		*/
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		
		/*
		 * BinInteger�� ��Ģ������
		 * ���� = n.add(m)
		 * ���� = n.subtract(m)
		 * ���� = n.multiply(m)
		 * ������ = n.divide(m)
		 * ������ = n.remainder(m)
		 */
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
	}
}