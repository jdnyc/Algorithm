package class2;
/* 
 * 2022/12/30
 * ���� : N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, 
 * 		 M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.
 */
import java.util.Scanner;

public class Bj_2798_1230 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int tmp = 1000;
		int sum = 0;
		
		int [] card = new int [N];
		
		for(int i=0; i<card.length; i++) {
			card[i] = sc.nextInt();
		}
		
		for(int i=0; i<card.length; i++) {
			for(int j=i+1; j<card.length; j++) {
				for(int k=j+1; k<card.length; k++) {
					sum = card[i]+card[j]+card[k];
					System.out.println(sum);
					if(M>=sum) {
						if(tmp>M-sum) {
							tmp = sum;
						} else if(sum==M){
							tmp = sum;
						}
					}
				}
			}
		}
		
		System.out.println(tmp);
		
	}
}
