package class1;
/* 
 * 2022/12/02
 * ���� :�� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ� (�Ҽ�������)
 */
import java.util.Scanner;

public class Bj_1008_1202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�Ҽ��� ���� ����� �ؾ� �ϱ� ������ �Ǽ��� Ÿ���� double������ ���� �� ����
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		//�Ǽ��� ���� a, b ������ ���
		System.out.println(a/b);
	}
}