package class1;
/* 
 * 2022/12/17
 * 문제 : 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
 * 		 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
 * 		 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
 * 		 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성
 */
import java.util.Scanner;

public class Bj_3052_1217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int [] arr = new int[10];
			
			//10개 수를 42로 나눈 나머지
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt() % 42;
			}
			
			//서로 다른 개수 저장할 cnt
			int cnt = 0;
			//같은 수인지 판별할 tmp
			int tmp = 0;
			
			for (int i = 0; i < arr.length; i++) {
				//i의 반복마다 tmp를 0으로 초기화
				tmp = 0; 
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						//i수와 나머지 수를 비교하며 같다면 tmp 개수 증가
						tmp++;
					}
				}
				//만약 나머지수와 비교했을때 tmp가 0이라면 서로 다른 개수 증가
				if(tmp==0) {
					cnt++;
				}
			}

			System.out.println(cnt);
	}

}
