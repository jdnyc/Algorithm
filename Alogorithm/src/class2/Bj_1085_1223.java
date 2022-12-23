package class2;
/* 
 * 2022/12/23
 * 문제 : 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
 * 		 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Bj_1085_1223 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//x,y,w,h 입력
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//점에서부터 각 거리 계산을 배열에 저장
		int [] arr = {(w-x), (h-y), x, y};
		//최소값 저장할 min
		int min = arr[0];
		
		//배열의 최소값 구하는 반복문
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		//최소값출력
		System.out.println(min);
		
		
	}
}
