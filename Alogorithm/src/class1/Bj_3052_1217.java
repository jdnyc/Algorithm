package class1;
/* 
 * 2022/12/17
 * ���� : �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
 * 		 ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
 * 		 �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
 * 		 �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;

public class Bj_3052_1217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int [] arr = new int[10];
			
			//10�� ���� 42�� ���� ������
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt() % 42;
			}
			
			//���� �ٸ� ���� ������ cnt
			int cnt = 0;
			//���� ������ �Ǻ��� tmp
			int tmp = 0;
			
			for (int i = 0; i < arr.length; i++) {
				//i�� �ݺ����� tmp�� 0���� �ʱ�ȭ
				tmp = 0; 
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						//i���� ������ ���� ���ϸ� ���ٸ� tmp ���� ����
						tmp++;
					}
				}
				//���� ���������� �������� tmp�� 0�̶�� ���� �ٸ� ���� ����
				if(tmp==0) {
					cnt++;
				}
			}

			System.out.println(cnt);
	}

}
