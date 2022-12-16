package class1;
/* 
 * 2022/12/16
 * 문제 : 45분 일찍 알람 설정하기
 * 		첫째 줄에 두 정수 H와 M이 주어진다. 
 * 		(0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 
 * 		그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
		입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 
		끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
 */
import java.util.Scanner;

public class Bj_2884_1216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int H = sc.nextInt();
			int M = sc.nextInt();
			
			/*
			 * (조건)
			 * M이 45분보다 작으면 M+15, H-1
			 * 이 조건에서 H가 0이면 H는 23이어야 함
			 * 
			 * M이 45분보다 크거나 같으면 M-45
			 * 
			 */
			if(45>M) {
				M = M+15;
				if(H==0) {
					H = 23;
				} else {
					H = H-1;
				}
			} else if(M>=45) {
				M = M-45;
			}
			
			System.out.println(H+" "+M);
	}

}
