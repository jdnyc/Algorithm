package class1;
/* 
 * 2022/12/09
 * ���� : ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		 ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
 * 		 ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
 * 		 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�.
 * 		 ������, 2000���� 400�� ����̱� ������ �����̴�.
 */
import java.util.Scanner;

public class Bj_2753_1209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		
		if(year%4==0 && year%100!=0) {
			//4�� ����̸鼭, 100�� ����� �ƴ� �� 1���
			System.out.println("1");
		} else if (year%400==0) {
			//400�� ����϶� 1 ���
			System.out.println("1");
		} else {
			//�� �� ������ 0 ���
			System.out.println("0");
		}	
	}
}