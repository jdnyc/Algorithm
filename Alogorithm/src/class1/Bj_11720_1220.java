package class1;
/* 
 * 2022/12/20
 * ���� : N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class Bj_11720_1220 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		String N = sc.next();
		
		int sum = 0;
		for(int i=0; i<T; i++) {
			sum = sum+N.charAt(i)-'0';
		}
		
		System.out.println(sum);
	}

}
