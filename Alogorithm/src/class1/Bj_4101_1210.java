package class1;
/* 
 * 2022/12/10
 * 문제 : 두 양의 정수가 주어졌을 때, 첫 번째 수가 두 번째 수보다 큰지 구하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Bj_4101_1210 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//반복문
		while(true) {
			//비교할 두 수 입력
			int a = sc.nextInt();
			int b = sc.nextInt();
			//두 수 중 0과 0이 입력되면 반복문을 중단시킴
			if(a==0&&b==0) 
				break;
			
			if(a>b) {
				//a가 b보다 크면 Yes 출력
				System.out.println("Yes");
			} else {
				//그 외는 No 출력
				System.out.println("No");
			}
		}
	}
}