package class1;
/* 
 * 2022/12/05
 * ���� : ù° �ٿ� �� �������� ���� N�� M�� �־�����.
 * 		 ù° �ٿ� �� ������ ���� (|N-M|)�� ����Ѵ�.
 */
import java.util.Scanner;
public class Bj_2420_1205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�� �������� ���� ������ int�� ������ �Ѿ�⿡ long������ ����
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		//N-M ���� 0���� ������ N-M �տ� -�� �ٿ��ش�
		if(N-M<0) {
			System.out.println(-(N-M));
		}
		//N-M ���� 0���� ũ�� �׳� �״�� �E���� ���ش�.
		else if(N-M>=0) {
			System.out.println(N-M);
		}
	}
}
