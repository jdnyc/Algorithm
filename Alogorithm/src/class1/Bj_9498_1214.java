package class1;
/* 
 * 2022/12/14
 * ���� : ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 
 * 		 70 ~ 79���� C, 60 ~ 69���� D, 
 * 		 ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;
public class Bj_9498_1214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		//������ 0���� 100������ ����
		if(score>=0&&score<=100) {
			if(score>=90&&score<=100) {
				//90�̻� 100���ϸ� A ���
				System.out.println("A");
			} else if(score>=80&&score<=89) {
				//80�̻� 89���ϸ� B���
				System.out.println("B");
			} else if(score>=70&&score<=79) {
				//70�̻� 79���ϸ� C���
				System.out.println("C");
			} else if(score>=60&&score<=69) {
				//60�̻� 69���ϸ� D���
				System.out.println("D");
			} else {
				//������ ���� F ���
				System.out.println("F");
			}
		}
		
	}
}
