package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		num = scanner.nextInt();

		if(num%2 == 0 & num > 0) {
			while(num > 0) {
				result += num;
				num -= 2;
			}
			System.out.println(result);
		}else if (num%2 == 1 & num > 0) {
			while(num > 0) {
				result += num;
				num -= 2;
			}
			System.out.println(result);
			
		} else {
			System.out.println("숫자가 잘못되었습니다.");
		}
		
		scanner.close();
		
	}

}
