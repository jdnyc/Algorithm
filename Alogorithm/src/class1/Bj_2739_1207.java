package class1;
/* 
 * 2022/12/07
 * ���� : N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 */
import java.util.Scanner;

public class Bj_2739_1207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//������ �� ���ڸ� �޴� ���� num ����
		int num = sc.nextInt();
		
		//�ݺ����� ���� ������ ���
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

}
