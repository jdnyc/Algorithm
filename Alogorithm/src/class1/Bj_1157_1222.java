package class1;
/* 
 * 2022/12/21
 * ���� : ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * 		 ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
 */
import java.util.Scanner;

public class Bj_1157_1222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		//������ ������ 26��
		//0���� a�� ������� ����
		int arr[] = new int[26];
		
		/*
		 * �빮�� = 65~90
		 */
		for(int i=0; i<S.length(); i++) {
			if(65<=S.charAt(i)&&S.charAt(i)<=90) {
				arr[S.charAt(i)-65]++;
			}
			else {
				//�ҹ��ڴ� 97�����̱⿡ 97�� ����
				arr[S.charAt(i)-97]++;
			}
		}
		
		//0�̸� a�� ���� ū�� �ǹǷ� -1
		int max = -1;
		char ch = '?';
		 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // �빮�ڷ� ����ؾ��ϹǷ� 65�� �����ش�.
			}
			//���� ���ڸ� '?' ���
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
	}

}
