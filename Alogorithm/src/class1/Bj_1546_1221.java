package class1;
/* 
 * 2022/12/21
 * ���� : �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. 
 * 		 �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
 * 		 ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
 * 		 �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;

public class Bj_1546_1221 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���� �� ������ ����
		int N = sc.nextInt();
		
		//���� ���� ���� (���� ������ �Ǽ��̱⿡ double�� ����)
		double [] score = new double[N];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		//�ִ� ������ max
		double max = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}
		}
		
		//�� ������ sum
		double sum = 0;
		
		for(int i=0; i<score.length; i++) {
			sum = sum + score[i]/max*100;
		}
		
		System.out.println(sum/N);
		
	}

}
