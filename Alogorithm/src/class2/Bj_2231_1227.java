package class2;
/* 
 * 2022/12/27
 * ���� : � �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ�
 * 		 � �ڿ��� M�� �������� N�� ���, M�� N�� ������
 * 		 245�� �������� 256(=245+2+4+5)�� �ȴ�.
 */
import java.util.Scanner;

public class Bj_2231_1227 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        
		int result = 0;
 
		/*
		 * �����ڰ� ������ ���� �� �ִٰ� ������
		 * ���� ���ϴ� ���� ���� ���� ������ �̹Ƿ�
		 * ó������ N���� �ݺ����� ����
		 */
		for(int i = 0; i < N; i++) {
			int number = i;
			//�� �ڸ����� �� sum
			int sum = 0;
			
			while(number != 0) {
				sum += number % 10;	//�� �ڸ��� ��
				number /= 10; 
			}
			
			/* 
			 * i�� ���� i�� �� �ڸ��� ���� N�� ���� ��찡 ������ �̹Ƿ�
			 * �ݺ��� �ߴ�
			*/
			if(sum + i == N) {
				result = i;
				break;
			}
			
		}
 
		System.out.println(result);
		
	}
}
