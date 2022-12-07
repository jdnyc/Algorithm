package class1;
/* 
 * 2022/12/07
 * 문제 : N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class Bj_2738_1207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//행렬 크기 선언
		int [][] arr = new int [N][M];
		
		//두번의 행렬선언을 위한 반복문
		for(int i=0; i<2; i++) {
			//행 입력을 위한 반복문
			for(int j=0; j<N; j++) {
				//열 입력을 위한 반복문
				for(int k=0; k<M; k++) {
					//첫번째 행렬과 두번째 행렬의 값을 더함
					arr[j][k] += sc.nextInt();
				}
			}
		}
		
		//행렬 출력
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(arr[i][j] + " ");
			} System.out.println();
		}
	}
}
