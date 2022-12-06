package class1;
/* 
 * 2022/12/06
 * 문제 : 첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
		 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지
 */
import java.util.Scanner;
public class Bj_2475_1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//6자리의 고유번호를 저장할 배열 arr 선언
		int [] arr = new int [5];
		
		//각 배열 안에 고유 번호 입력해서 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//각 고유번호의 제곱의 합을 저장할 sum 선언
		int sum = 0;
		//이 전까지 더했던 값 저장할 변수 tmp 선언
		int tmp = 0;
		//고유번호를 차례대로 불러와서 sum 값을 계산
		for(int i=0; i<arr.length; i++) {
			sum = arr[i]*arr[i]+tmp;
			tmp = sum;
		}
		
		//검증수는 구해진 각 숫자들의 제곱한 수들의 합에 10을 나눈 나머지
		System.out.println(sum%10);
		
	}
}
