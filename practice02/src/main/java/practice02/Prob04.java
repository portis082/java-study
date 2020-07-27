package practice02;

public class Prob04 {
	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		int count = str.length();
		char[] c = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			count--;
			c[i] = str.charAt(count);
		}
		return c;
	}

	public static void printCharArray(char[] array){
		for (char c : array) {
			System.out.print(c);
		}
		System.out.println();
	}
}
