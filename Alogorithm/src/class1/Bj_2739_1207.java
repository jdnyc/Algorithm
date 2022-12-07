package class1;
/* 
 * 2022/12/07
 * 문제 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */
import java.util.Scanner;

public class Bj_2739_1207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//구구단 할 숫자를 받는 변수 num 선언
		int num = sc.nextInt();
		
		//반복문을 통해 구구단 출력
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

}
