package class1;
/* 
 * 2022/12/15
 * ���� : �� ���� �ڿ��� A, B, C�� �־��� �� 
 * 		 A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;
public class Bj_2557_1215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int mul = A*B*C;
		
		//int�� String���� ��ȯ
		String s = Integer.toString(mul);
		
		//0~9���� �ݺ�
		for(int i=0; i<10; i++) {
			//���� �� cnt 0���� �ʱ�ȭ
			int cnt = 0;
			for(int j=0; j<s.length(); j++) {
				//charAt() - '0' �� ����
				//���� ������ ù°�ڸ����� ���ϸ� cnt�� �߰�
				if(i==s.charAt(j)-'0') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}
}
