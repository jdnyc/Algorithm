package class1;
/* 
 * 2022/12/17
 * 문제 : "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
 * 		 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
 * 		 예를 들어, 10번 문제의 점수는 3이 된다.
 * 		 "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * 		 OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Bj_8958_1217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int T = sc.nextInt();
			//모든 점수를 저장할 배열 score
			String [] score = new String[T];
			//각 배열에 OX 점수 저장
			for (int i = 0; i < score.length; i++) {
				score[i] = sc.next();
			}
			//총 합 저장
			int sum = 0;
			//O의 연속 개수에 따라 증가할 점수 cnt
			int cnt = 0;
			for(int i=0; i<score.length; i++) {
				//매 점수의 첫 부분에서 sum, cnt 0으로 초기화
				sum = 0;
				cnt = 0;
				for(int j=0; j<score[i].length(); j++) {
					//O면 cnt 점수 증가, sum과 cnt값 합하여 sum에 입력
					if(score[i].charAt(j)=='O') {
						cnt++;
						sum = sum+cnt;
					} else if(score[i].charAt(j)=='X') {
						//X면 cnt값 0으로 초기화
						cnt=0;
					}
				}
				//sum 출력
				System.out.println(sum);
			}
	}

}
