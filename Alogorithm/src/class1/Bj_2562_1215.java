package class1;
/* 
 * 2022/12/15
 * ���� : 9���� ���� �ٸ� �ڿ����� �־��� ��, 
 * 		 �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;
public class Bj_2562_1215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//9���� �� ������ �迭 arr
		int[] arr = new int[9];
		//�ִ� ������ max
		int max = arr[0];
		//���° ������ ������ cnt
		int cnt = 0;
		
		//�迭 �Է�
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//�� �迭�� ��ҿ� max���� ���Ͽ� max���� �迭�� ��Ұ� ũ�� max�� ����
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				//�ε��� ��ȣ�� 1�� ���ؾ� ���° ������ �� �� �ִ�
				cnt = i+1;
			}
		}

		System.out.println(max);
		//���� ù��° ���� �ִ��� ��� �迭���� 0��° ���̱⿡ 1�� �����ش�
		if(cnt==0) {
			System.out.println(cnt+1);
		} else {
			System.out.println(cnt);
		}
	}
}
