package class1;
/* 
 * 2022/12/19
 * ���� : �� �ڿ��� A�� B�� �־�����. 
 * 		 �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 */
import java.util.Scanner;

public class Bj_10869_1219 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
			System.out.println(A-B);
			System.out.println(A*B);
			System.out.println(A/B);
			System.out.println(A%B);
	}

}
