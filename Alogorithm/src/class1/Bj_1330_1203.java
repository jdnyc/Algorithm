package class1;
/* 
 * 2022/12/03
 * ���� : �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;
public class Bj_1330_1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Scanner sc�� ���� �޾ƿ� ������ ���� a, b�� �� ����
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//if�� ����ؼ� a���� b���� ũ�� > ���
		if(a>b) {
			System.out.println(">");
		} 
		//a���� b���� ������ < ���
		else if(a<b) {
			System.out.println("<");
		} 
		//a���� b�� ������ == ���
		else if(a==b) {
			System.out.println("==");
		}
	}
}
