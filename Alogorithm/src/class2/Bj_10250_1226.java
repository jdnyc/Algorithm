package class2;
/* 
 * 2022/12/26
 * 문제 : 초기에 모든 방이 비어있다고 가정하에 이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호를 계산하는 프로그램이다. 첫 번째 손님은 101 호, 두 번째 손님은 201 호 등과 같이 배정한다. 
 * 		 그림 1 의 경우를 예로 들면, H = 6이므로 10 번째 손님은 402 호에 배정
 */
import java.util.Scanner;

public class Bj_10250_1226 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			//층, 호, 인원
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			/* 층
			 * 층 Y는 N을 H로 나눈 나머지이다
			 * 그러나, 나머지가 0이되었을 때는
			 * 끝 층 이므로
			 * Y는 H가 된다
			 */
			int Y;
			if(N%H==0) {
				Y=H*100;
			} else {
				Y=N%H*100;
			}
			
			/*
			 * 호
			 * 호는 0호부터 시작이 아니기에
			 * N을 H로 나눈 값에 1을 더해준다
			 * 하지만 N과 H의 값이 똑같을 경우 +1이 되기에
			 * N과 H의 값이 똑같은 경우는 그냥 나눈 값만 저장한다.
			 */
			int X;
			if(N%H==0) {
				X = N/H;
			} else {
				X = (N/H)+1;
			}
			
			System.out.println(Y+X);
		}
		
	}
}
