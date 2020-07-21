package practice01;

public class Prob05 {

	public static void main(String[] args) {
		int count = 1;
		int clapping = 0;
		
		while (count < 100) {
			int unit = count%10;
			int tenth = count/10;
			if ((unit)%3 == 0 & unit != 0)
				clapping++;
			if ((tenth)%3 == 0 & tenth != 0)
				clapping++;
			
			switch (clapping) {
				case 1:
					System.out.println(count + "  짝");
					break;
				
				case 2:
					System.out.println(count + "  짝짝");
					break;
			}
			
			clapping = 0;
			count++;
		}
		
	}
}
