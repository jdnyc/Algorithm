package class1;
/* 
 * 2022/12/21
 * 문제 : 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
 * 		 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
 * 		 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 * 		 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성
 */
import java.util.Scanner;

public class Bj_1546_1221 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//시험 본 과목의 개수
		int N = sc.nextInt();
		
		//시험 점수 저장 (시험 점수가 실수이기에 double형 선언)
		double [] score = new double[N];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		//최댓값 저장할 max
		double max = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}
		}
		
		//합 저장할 sum
		double sum = 0;
		
		for(int i=0; i<score.length; i++) {
			sum = sum + score[i]/max*100;
		}
		
		System.out.println(sum/N);
		
	}

}
