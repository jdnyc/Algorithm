package class2;
/* 
 * 2022/12/24
 * ���� : �־��� ������ ���̷� �ﰢ���� �������� �ƴ��� �����Ͻÿ�.
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
			
			//���� �ﰢ���� ū���� ������ �������� ������ �հ� ���� ����
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
