package class1;
/* 
 * 2022/12/14
 * ���� : ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 * 	 	 ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
 */
import java.util.Scanner;
public class Bj_2439_1214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			//N-i��ŭ ������ ����
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			//������ ���� ������ *�� ä��
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
