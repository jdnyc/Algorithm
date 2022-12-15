package class1;
/* 
 * 2022/12/15
 * 문제 : 문자열 S를 입력받은 후에, 
 * 	 	 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
 */
import java.util.Scanner;

public class Bj_2675_1215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<n; k++) {
					System.out.print(s.charAt(j));
				}
				
			}
			System.out.println();
		}
	}
}
