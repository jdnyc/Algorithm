package class1;
/* 
 * 2022/12/15
 * ���� : ���ڿ� S�� �Է¹��� �Ŀ�, 
 * 	 	 �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 */
import java.util.Scanner;

public class Bj_2675_1215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�׽�Ʈ ���̽� �� �Է�
		int N = sc.nextInt();
		
		//�׽�Ʈ ���̽� �� ��ŭ �ݺ�
		for(int i=0; i<N; i++) {
			//���ڸ� �ݺ��� Ƚ�� �Է�
			int n = sc.nextInt();
			//�ݺ��� ���� �Է�
			String s = sc.next();
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<n; k++) {
					System.out.print(s.charAt(j));
				}
				
			}
			System.out.println();
		}
	}
}
