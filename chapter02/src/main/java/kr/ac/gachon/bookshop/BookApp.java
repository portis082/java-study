package kr.ac.gachon.bookshop;

public class BookApp {
	
	private static int BOOKCOUNT = 0;
	public void test() {
		
	}
	
	public static void main(String[] args) {
		

		
		Book b = new Book();
		Book a = b;
		System.out.println("HelloWorld");
		System.out.println(a);
		System.out.println(b);
	}

}