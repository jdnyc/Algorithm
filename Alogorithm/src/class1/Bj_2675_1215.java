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
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int n = sc.nextInt();
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
