package class2;
/* 
 * 2022/12/26
 * ���� : �ʱ⿡ ��� ���� ����ִٰ� �����Ͽ� �� ��å�� ���� N ��°�� ������ �մԿ��� ������ �� ��ȣ�� ����ϴ� ���α׷��̴�. ù ��° �մ��� 101 ȣ, �� ��° �մ��� 201 ȣ ��� ���� �����Ѵ�. 
 * 		 �׸� 1 �� ��츦 ���� ���, H = 6�̹Ƿ� 10 ��° �մ��� 402 ȣ�� ����
 */
import java.util.Scanner;

public class Bj_10250_1226 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			//��, ȣ, �ο�
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			/* ��
			 * �� Y�� N�� H�� ���� �������̴�
			 * �׷���, �������� 0�̵Ǿ��� ����
			 * �� �� �̹Ƿ�
			 * Y�� H�� �ȴ�
			 */
			int Y;
			if(N%H==0) {
				Y=H*100;
			} else {
				Y=N%H*100;
			}
			
			/*
			 * ȣ
			 * ȣ�� 0ȣ���� ������ �ƴϱ⿡
			 * N�� H�� ���� ���� 1�� �����ش�
			 * ������ N�� H�� ���� �Ȱ��� ��� +1�� �Ǳ⿡
			 * N�� H�� ���� �Ȱ��� ���� �׳� ���� ���� �����Ѵ�.
			 */
			int X;
			if(N%H==0) {
				X = N/H;
			} else {
				X = (N/H)+1;
			}
			
			System.out.println(Y+X);
		}
		
	}
}
