package class1;
/* 
 * 2022/12/19
 * ���� : ���� N���� �̷���� ���� A�� ���� X�� �־�����. 
 * 		 �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class Bj_10871_1219 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int A = sc.nextInt();
		
		//���� X���� �̷���� �迭 N
		int [] N = new int[X];
		
		//�迭�� ���� �Է�
		for(int i=0; i<N.length; i++) {
			N[i] = sc.nextInt();
		}
		
		//�Էµ� ���� A�� ���Ͽ� A���� ���� N[i]�� ���
		for(int i=0; i<N.length; i++) {
			if(A>N[i])
				System.out.print(N[i]+" ");
		}	
	}

}
