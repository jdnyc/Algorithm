package class1;
/* 
 * 2022/12/13
 * ���� :  �������� ���� Ư�������� 28���� �����ߴµ�, 
 * 		  �� �߿��� ���� �� �� �л� 2���� �⼮��ȣ�� ���ϴ� ���α׷��� �ۼ�
 */

import java.util.Scanner;

public class Bj_5597_1213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[31];
		
		//�Է��� �� 28���̱⿡ 1���� 28����
		for(int i=1; i<29; i++) {
			int clear = sc.nextInt();
			//������ ������ ���� ������ ����� �迭 ��ҿ� 1�� �־��ش�
			student[clear]=1;
		}
		
		for(int i=1; i<student.length; i++) {
			//������ 1�� ������ �� ����� ������ ���� ���̱⿡ ���
			if(student[i]!=1) {
				System.out.println(i);
			}
		}
		
	}
}