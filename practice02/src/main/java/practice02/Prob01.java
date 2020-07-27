package practice02;

import java.util.Scanner;

public class Prob01 {
		private static int price = 0;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액 : ");
		price = scan.nextInt();
		
		calculate(price, 50000);
		calculate(price, 10000);
		calculate(price, 5000);
		calculate(price, 1000);
		calculate(price, 500);
		calculate(price, 100);
		calculate(price, 50);
		calculate(price, 10);
		calculate(price, 5);
		calculate(price, 1);
		
		scan.close();
	}
	
	public static void calculate(int inputPrice, int subMoney) {
		int count = 0;
		while (inputPrice-subMoney >= 0) {
			inputPrice -= subMoney;
			count++;
		}
		price = inputPrice;
		System.out.println(subMoney + "원 : " + count + "개");
	}
}
