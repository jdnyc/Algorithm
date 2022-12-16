package class1;
/* 
 * 2022/12/16
 * 문제 : 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
 * 		 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 * 		 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성.
 * 		 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 
 * 		 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
 */
import java.util.Scanner;

public class Bj_2908_1216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			//1의자리를 100의자리로 = (A%10)*100
			//10의 자리를 10의자리 그대로 = (A/10%10)*10\
			//100의 자리를 1의 자리로 = A/100
			int C = (A%10)*100+(A/10%10)*10+A/100;
			int D = (B%10)*100+(B/10%10)*10+B/100;
			
			if(C>D) {
				System.out.println(C);
			} else {
				System.out.println(D);
			}
	}

}
