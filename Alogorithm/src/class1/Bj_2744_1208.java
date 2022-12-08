package class1;
/* 
 * 2022/12/08
 * 문제 : 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 
 * 		 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오
 */
import java.util.Scanner;

public class Bj_2744_1208 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			//charAt으로 문자열을 문자형으로 저장
			char c = s.charAt(i);
			
			//문자 하나씩 대문자, 소문자 비교
			if(65<=c&&c<=90) {
				//대문자면 +32를 해서 소문자로 변환 후 출력
				c = (char)(c+32);
				System.out.print(c);
			} else if (97<=c&&c<=122) {
				//소문자면 -32를 해서 대문자로 변환 후 출력
				c = (char)(c-32);
				System.out.print(c);
			}
		}
		
		
	}

}
