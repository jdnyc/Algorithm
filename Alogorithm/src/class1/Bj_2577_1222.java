package class1;
/* 
 * 2022/12/22
 * ���� : �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 
 * 		 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		 ���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
 * 		 ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 */
import java.util.Scanner;

public class Bj_2577_1222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[10];
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int mul = A*B*C;
		//���� ������ ���ڿ��� ��ȯ
		String N = Integer.toString(mul);
		
		//�ش� ������ �迭 ��Ҵ� +1�� �Ͽ� ���� ������
		for(int i=0; i<N.length(); i++) {
			num[N.charAt(i)-'0']++;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
