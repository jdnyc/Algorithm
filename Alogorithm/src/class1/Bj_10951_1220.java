package class1;
/* 
 * 2022/12/20
 * ���� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class Bj_10951_1220 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//hasNext�� booleanŸ������ ��ȯ�Ѵ�
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
	}

}
