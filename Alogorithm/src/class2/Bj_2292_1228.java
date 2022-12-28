package class2;
/* 
 * 2022/12/28
 * 문제 : 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
 * 		 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 
 * 		 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
 * 		 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
 */
import java.util.Scanner;

public class Bj_2292_1228 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 여기서 규칙은
		 * 그 다음수에서 6의 배수의 -1만큼 커지는 범위에 숫자가 있다는 것이다
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
			//tmp가 x보다 작거나 같으면 i 출력 후 종료
			else if(tmp>=x) {
				System.out.println(i);
				break;
			}
			tmp = tmp + ((6*i)-1);
			tmp++;
		} 
		
	}
}
