package class1;
/* 
 * 2022/12/14
 * ���� : n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;
public class Bj_8393_1214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
