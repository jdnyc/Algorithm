package class1;
/* 
 * 2022/12/07
 * ���� : N*Mũ���� �� ��� A�� B�� �־����� ��, �� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;
public class Bj_2738_1207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//��� ũ�� ����
		int [][] arr = new int [N][M];
		
		//�ι��� ��ļ����� ���� �ݺ���
		for(int i=0; i<2; i++) {
			//�� �Է��� ���� �ݺ���
			for(int j=0; j<N; j++) {
				//�� �Է��� ���� �ݺ���
				for(int k=0; k<M; k++) {
					//ù��° ��İ� �ι�° ����� ���� ����
					arr[j][k] += sc.nextInt();
				}
			}
		}
		
		//��� ���
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(arr[i][j] + " ");
			} System.out.println();
		}
	}
}
