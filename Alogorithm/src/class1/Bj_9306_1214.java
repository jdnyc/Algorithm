package class1;
/* 
 * 2022/12/14
 * ���� : ���ڿ��� �Է����� �ָ� ���ڿ��� ù ���ڿ� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;
public class Bj_9306_1214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			String s = sc.next();
			
			//charAt���� ���ڿ��� ù��° ���� �����Ͽ� ���
			System.out.print(s.charAt(0));
			//���ڿ��� ����-1�� ������ ���� �����Ͽ� ���
			System.out.println(s.charAt(s.length()-1));
		}
	}
}
