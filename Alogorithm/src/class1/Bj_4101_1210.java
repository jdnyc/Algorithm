package class1;
/* 
 * 2022/12/10
 * ���� : �� ���� ������ �־����� ��, ù ��° ���� �� ��° ������ ū�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class Bj_4101_1210 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�ݺ���
		while(true) {
			//���� �� �� �Է�
			int a = sc.nextInt();
			int b = sc.nextInt();
			//�� �� �� 0�� 0�� �ԷµǸ� �ݺ����� �ߴܽ�Ŵ
			if(a==0&&b==0) 
				break;
			
			if(a>b) {
				//a�� b���� ũ�� Yes ���
				System.out.println("Yes");
			} else {
				//�� �ܴ� No ���
				System.out.println("No");
			}
		}
	}
}