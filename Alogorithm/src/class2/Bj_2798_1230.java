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
		int sum = 0;
		
		int [] card = new int [N];
		
		for(int i=0; i<card.length; i++) {
			card[i] = sc.nextInt();
		}
		
		int tmp = card[0];
		
		for(int i=0; i<card.length; i++) {
			for(int j=i+1; j<card.length; j++) {
				for(int k=j+1; k<card.length; k++) {
					sum = card[i]+card[j]+card[k];
					if(sum==M){
						tmp = M-sum;
					}
					if(M>sum) {
						if(tmp>M-sum) {
							tmp = M-sum;
						} 
					}
				}
			}
		}		
		System.out.println(M-tmp);		
	}
}