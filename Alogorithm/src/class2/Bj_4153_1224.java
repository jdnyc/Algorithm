package class2;
/* 
 * 2022/12/24
 * 문제 : 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
 */
import java.util.Scanner;

public class Bj_4153_1224 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if(x==0&&y==0&&z==0) 
				break;
			
			//직각 삼각형은 큰변의 제곱이 작은변들 제곱의 합과 값이 같다
			if(z*z==(x*x)+(y*y)) {
				System.out.println("right");
			} else if((z*z+y*y)==x*x) {
				System.out.println("right");
			} else if((x*x+z*z)==y*y) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
	
		}
		
	}
}
