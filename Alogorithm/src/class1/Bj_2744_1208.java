package class1;
/* 
 * 2022/12/08
 * ���� : ���� �ҹ��ڿ� �빮�ڷ� �̷���� �ܾ �Է¹��� ��, 
 * 		 �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 */
import java.util.Scanner;

public class Bj_2744_1208 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			//charAt���� ���ڿ��� ���������� ����
			char c = s.charAt(i);
			
			//���� �ϳ��� �빮��, �ҹ��� ��
			if(65<=c&&c<=90) {
				//�빮�ڸ� +32�� �ؼ� �ҹ��ڷ� ��ȯ �� ���
				c = (char)(c+32);
				System.out.print(c);
			} else if (97<=c&&c<=122) {
				//�ҹ��ڸ� -32�� �ؼ� �빮�ڷ� ��ȯ �� ���
				c = (char)(c-32);
				System.out.print(c);
			}
		}
		
		
	}

}
