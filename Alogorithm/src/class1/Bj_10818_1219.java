package class1;
/* 
 * 2022/12/19
 * ���� : N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;

public class Bj_10818_1219 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int T = sc.nextInt();
			int [] num = new int[T];
			
			//�迭�� N���� ���� ����
			for (int i = 0; i< num.length; i++) {
				num[i] = sc.nextInt();
			}
			
			//�ִ� ������ ���� max (�ִ밪�� �迭�� ù��°�� ����)
			int max = num[0];
			//�ּڰ��� ������ ���� min (�ּڰ��� �迭�� ��������°�� ����)
			int min = num[T-1];
			
			//max�� num[i]���� ũ�� num[i]�� max�� ����
			for (int i = 0; i < num.length; i++) {
				if(num[i]>max) {
					max=num[i];
				}
			}
			
			//min�� num[i]���� ������ num[i]�� min�� ����
			for (int i = 0; i < num.length; i++) {
				if(num[i]<min) {
					min=num[i];
				}
			}
			
			System.out.print(min+" "+max);
		
	}

}
