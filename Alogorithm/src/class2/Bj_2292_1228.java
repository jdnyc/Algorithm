package class2;
/* 
 * 2022/12/28
 * ���� : 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. 
 * 		 ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ 
 * 		 �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * 		 ���� ���, 13������ 3��, 58������ 5���� ������.
 */
import java.util.Scanner;

public class Bj_2292_1228 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * ���⼭ ��Ģ��
		 * �� ���������� 6�� ����� -1��ŭ Ŀ���� ������ ���ڰ� �ִٴ� ���̴�
		 */
		/*
		int N = sc.nextInt();
		int room = 0;
		int tmp = 1;
		int cnt = 1;
		int num = 0;
		
		while(num!=1) {
			tmp = room+tmp;
			for(int i=0; i<=tmp; i++) {
				if(i==N) {
					num = 1;
					System.out.println(cnt);
					break;
				}	
			}
			
			room = cnt*6;
			cnt++;
		}
		*/
		int x = sc.nextInt();
		int tmp = 1;
		
		
		for(int i=0; ; i++) {
			if(x==1) {
				System.out.println(1);
				break;
			}
			//tmp�� x���� �۰ų� ������ i ��� �� ����
			else if(tmp>=x) {
				System.out.println(i);
				break;
			}
			tmp = tmp + ((6*i)-1);
			tmp++;
		} 
		
	}
}
