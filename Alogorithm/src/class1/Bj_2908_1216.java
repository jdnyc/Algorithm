package class1;
/* 
 * 2022/12/16
 * ���� : 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. 
 * 		 ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
 * 		 �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ�.
 * 		 ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. 
 * 		 �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.
 */
import java.util.Scanner;

public class Bj_2908_1216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			//1���ڸ��� 100���ڸ��� = (A%10)*100
			//10�� �ڸ��� 10���ڸ� �״�� = (A/10%10)*10\
			//100�� �ڸ��� 1�� �ڸ��� = A/100
			int C = (A%10)*100+(A/10%10)*10+A/100;
			int D = (B%10)*100+(B/10%10)*10+B/100;
			
			if(C>D) {
				System.out.println(C);
			} else {
				System.out.println(D);
			}
	}

}
