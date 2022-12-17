package class1;
/* 
 * 2022/12/17
 * 문제 : 1부터 8까지 차례대로 연주한다면 ascending, 
 * 		 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 * 		 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 
 * 		 아니면 mixed인지 판별하는 프로그램을 작성
 */
import java.util.Scanner;

public class Bj_2920_1217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			//8개의 음 받아올 배열 선언과 생성
			int [] A = new int [8];
			
			//배열에 숫자 입력
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}
			
			//판별할 int
			int B = 0;
			
			for (int i =0 ; i < A.length-1; i++) {
				//다음 숫자의 -1을 했을때 지금 숫자와 같다면 0을 저장
				if(A[i]==(A[i+1]-1)) {
					B=0;
				} 
				//다음 숫자의 +1을 했을때 지금 숫자와 같다면 1을 저장
				else if(A[i]==(A[i+1]+1)) {
					B=1;
				} 
				//그 외 나머지는 2를 저장
				//break를 하지 않는다면 계속 반복문이 돌게 된다
				else {
					B=2;
					break;
				}
			}
			
			if(B==0) {
				//B가 0이면 ascending (오름차순) 출력
				System.out.println("ascending");
			} else if(B==1) {
				//B가 1이면 descending (내림차순) 출력
				System.out.println("descending");
			} else if(B==2) {
				//그 외 나머지 2이면 mixed 출력
				System.out.println("mixed");
			}
			
	}

}
