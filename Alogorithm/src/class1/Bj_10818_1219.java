package class1;
/* 
 * 2022/12/19
 * 문제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성
 */
import java.util.Scanner;

public class Bj_10818_1219 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int T = sc.nextInt();
			int [] num = new int[T];
			
			//배열에 N개의 정수 저장
			for (int i = 0; i< num.length; i++) {
				num[i] = sc.nextInt();
			}
			
			//최댓값 저장할 변수 max (최대값은 배열의 첫번째에 저장)
			int max = num[0];
			//최솟값을 저장할 변수 min (최솟값은 배열의 마지막번째에 저장)
			int min = num[T-1];
			
			//max가 num[i]보다 크면 num[i]를 max에 저장
			for (int i = 0; i < num.length; i++) {
				if(num[i]>max) {
					max=num[i];
				}
			}
			
			//min이 num[i]보다 작으면 num[i]를 min에 저장
			for (int i = 0; i < num.length; i++) {
				if(num[i]<min) {
					min=num[i];
				}
			}
			
			System.out.print(min+" "+max);
		
	}

}
