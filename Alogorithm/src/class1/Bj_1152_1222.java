package class1;
/* 
 * 2022/12/22
 * ���� : ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? 
 * 		 �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * 		 ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
 */

import java.util.Scanner;

public class Bj_1152_1222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		//���ڿ� ���� ����
		s=s.trim();
		//" "�� �����Ͽ� ���ڿ��� ������ �迭�� ����
		String[] arr = s.split(" ");
		if(s.isEmpty()) {
			//s�� �����̸� 0 ���
			System.out.println(0);
		} else {
			System.out.println(arr.length);
		}
	}
}