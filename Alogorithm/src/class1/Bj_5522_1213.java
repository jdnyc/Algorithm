package class1;
/* 
 * 2022/12/13
 * ���� :  �� ī�� ������ 5ȸ�� �������� ����Ǹ�, �� �������� �ºθ� �ϴ� �����̴�.
 * 		  JOI���� �� ������ ������ ��Ÿ���� ������ �־����� ��, 
 * 		  JOI���� ������ ���ϴ� ���α׷��� �ۼ�
 */

import java.util.Scanner;

public class Bj_5522_1213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//������ �� ���� ���� sum ����
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			int A = sc.nextInt();
			
			//���� ������ 0�̻� 100�����̱⿡ ���ǹ� �Է�
			if(A>=0&&A<=100) {
				sum = sum+A;
			}
		}
		
		System.out.println(sum);
	}
}