package class2;
/* 
 * 2022/12/23
 * ���� : �Ѽ��� ���� (x, y)�� �ִ�. ���簢���� �� ���� ��ǥ�࿡ �����ϰ�, ���� �Ʒ� �������� (0, 0), ������ �� �������� (w, h)�� �ִ�.
 * 		 ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class Bj_1085_1223 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//x,y,w,h �Է�
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//���������� �� �Ÿ� ����� �迭�� ����
		int [] arr = {(w-x), (h-y), x, y};
		//�ּҰ� ������ min
		int min = arr[0];
		
		//�迭�� �ּҰ� ���ϴ� �ݺ���
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		//�ּҰ����
		System.out.println(min);
		
		
	}
}
