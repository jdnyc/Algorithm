package class1;
/* 
 * 2022/12/17
 * ���� : 1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 
 * 		 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed �̴�.
 * 		 ������ ������ �־����� ��, �̰��� ascending����, descending����, 
 * 		 �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;

public class Bj_2920_1217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			//8���� �� �޾ƿ� �迭 ����� ����
			int [] A = new int [8];
			
			//�迭�� ���� �Է�
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}
			
			//�Ǻ��� int
			int B = 0;
			
			for (int i =0 ; i < A.length-1; i++) {
				//���� ������ -1�� ������ ���� ���ڿ� ���ٸ� 0�� ����
				if(A[i]==(A[i+1]-1)) {
					B=0;
				} 
				//���� ������ +1�� ������ ���� ���ڿ� ���ٸ� 1�� ����
				else if(A[i]==(A[i+1]+1)) {
					B=1;
				} 
				//�� �� �������� 2�� ����
				//break�� ���� �ʴ´ٸ� ��� �ݺ����� ���� �ȴ�
				else {
					B=2;
					break;
				}
			}
			
			if(B==0) {
				//B�� 0�̸� ascending (��������) ���
				System.out.println("ascending");
			} else if(B==1) {
				//B�� 1�̸� descending (��������) ���
				System.out.println("descending");
			} else if(B==2) {
				//�� �� ������ 2�̸� mixed ���
				System.out.println("mixed");
			}
			
	}

}
