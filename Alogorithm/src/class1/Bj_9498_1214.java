package class1;
/* 
 * 2022/12/14
 * 문제 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
 * 		 70 ~ 79점은 C, 60 ~ 69점은 D, 
 * 		 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class Bj_9498_1214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		//점수는 0에서 100사이의 정수
		if(score>=0&&score<=100) {
			if(score>=90&&score<=100) {
				//90이상 100이하면 A 출력
				System.out.println("A");
			} else if(score>=80&&score<=89) {
				//80이상 89이하면 B출력
				System.out.println("B");
			} else if(score>=70&&score<=79) {
				//70이상 79이하면 C출력
				System.out.println("C");
			} else if(score>=60&&score<=69) {
				//60이상 69이하면 D출력
				System.out.println("D");
			} else {
				//나머지 점수 F 출력
				System.out.println("F");
			}
		}
		
	}
}
