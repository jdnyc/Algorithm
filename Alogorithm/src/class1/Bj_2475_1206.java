package class1;
/* 
 * 2022/12/06
 * ���� : ù° �ٿ� ������ȣ�� ó�� 5�ڸ��� ���ڵ��� ��ĭ�� ���̿� �ΰ� �ϳ��� �־�����.
		 �������� ������ȣ�� ó�� 5�ڸ��� ���� 5���� ���ڸ� ���� ������ ���� ���� 10���� ���� ������
 */
import java.util.Scanner;
public class Bj_2475_1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//6�ڸ��� ������ȣ�� ������ �迭 arr ����
		int [] arr = new int [5];
		
		//�� �迭 �ȿ� ���� ��ȣ �Է��ؼ� ����
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//�� ������ȣ�� ������ ���� ������ sum ����
		int sum = 0;
		//�� ������ ���ߴ� �� ������ ���� tmp ����
		int tmp = 0;
		//������ȣ�� ���ʴ�� �ҷ��ͼ� sum ���� ���
		for(int i=0; i<arr.length; i++) {
			sum = arr[i]*arr[i]+tmp;
			tmp = sum;
		}
		
		//�������� ������ �� ���ڵ��� ������ ������ �տ� 10�� ���� ������
		System.out.println(sum%10);
		
	}
}
