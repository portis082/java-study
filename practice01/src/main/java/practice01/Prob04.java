package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		String string = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		string = scanner.nextLine();
		
		for (int i=0; i<string.length(); i++) {
			for (int j=0; j <= i; j++) {
				System.out.print(string.charAt(j));
			}
			System.out.println();
		}
		
		scanner.close();
	}
}