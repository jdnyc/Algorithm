package class1;
/* 
 * 2022/12/17
 * ���� : "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
 * 		 ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
 * 		 ���� ���, 10�� ������ ������ 3�� �ȴ�.
 * 		 "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
 * 		 OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class Bj_8958_1217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int T = sc.nextInt();
			//��� ������ ������ �迭 score
			String [] score = new String[T];
			//�� �迭�� OX ���� ����
			for (int i = 0; i < score.length; i++) {
				score[i] = sc.next();
			}
			//�� �� ����
			int sum = 0;
			//O�� ���� ������ ���� ������ ���� cnt
			int cnt = 0;
			for(int i=0; i<score.length; i++) {
				//�� ������ ù �κп��� sum, cnt 0���� �ʱ�ȭ
				sum = 0;
				cnt = 0;
				for(int j=0; j<score[i].length(); j++) {
					//O�� cnt ���� ����, sum�� cnt�� ���Ͽ� sum�� �Է�
					if(score[i].charAt(j)=='O') {
						cnt++;
						sum = sum+cnt;
					} else if(score[i].charAt(j)=='X') {
						//X�� cnt�� 0���� �ʱ�ȭ
						cnt=0;
					}
				}
				//sum ���
				System.out.println(sum);
			}
	}

}
