package class1;
/* 
 * 2022/12/20
 * ���� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class Bj_10950_1220 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�׽�Ʈ ���̽��� ��
		int T = sc.nextInt();
		
		//�׽�Ʈ ���̽� ��ŭ �Է¹ް� ���
		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
	}

}
