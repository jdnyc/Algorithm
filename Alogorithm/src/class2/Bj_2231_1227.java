package class2;
/* 
 * 2022/12/27
 * 문제 : 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미
 * 		 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자
 * 		 245의 분해합은 256(=245+2+4+5)이 된다.
 */
import java.util.Scanner;

public class Bj_2231_1227 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        
		int result = 0;
 
		/*
		 * 생성자가 여러개 있을 수 있다고 하지만
		 * 지금 구하는 것은 가장 작은 생성자 이므로
		 * 처음부터 N까지 반복문을 쓴다
		 */
		for(int i = 0; i < N; i++) {
			int number = i;
			//각 자리수의 합 sum
			int sum = 0;
			
			while(number != 0) {
				sum += number % 10;	//각 자리수 합
				number /= 10; 
			}
			
			/* 
			 * i의 값과 i의 각 자리수 합이 N과 같을 경우가 생성자 이므로
			 * 반복문 중단
			*/
			if(sum + i == N) {
				result = i;
				break;
			}
			
		}
 
		System.out.println(result);
		
	}
}
