package class1;
/* 
 * 2022/12/15
 * 문제 : 9개의 서로 다른 자연수가 주어질 때, 
 * 		 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성
 */
import java.util.Scanner;
public class Bj_2562_1215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//9개의 수 저장할 배열 arr
		int[] arr = new int[9];
		//최댓값 저장할 max
		int max = arr[0];
		//몇번째 수인지 저장할 cnt
		int cnt = 0;
		
		//배열 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//각 배열의 요소와 max값을 비교하여 max보다 배열의 요소가 크면 max에 저장
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				//인덱스 번호에 1을 더해야 몇번째 수인지 알 수 있다
				cnt = i+1;
			}
		}

		System.out.println(max);
		//만약 첫번째 수가 최댓값일 경우 배열에서 0번째 수이기에 1을 더해준다
		if(cnt==0) {
			System.out.println(cnt+1);
		} else {
			System.out.println(cnt);
		}
	}
}
