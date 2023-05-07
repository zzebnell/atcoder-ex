import java.util.Scanner;

public class PContheTable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte H = sc.nextByte();
		byte W = sc.nextByte();
		
		for (byte i = 0; i < H; i++) {
			String test = sc.next();
			char[] res = test.toCharArray();
			
			for (byte j = 0; j < W - 1; j++) {
				if (res[j] == 'T' && res[j + 1] == 'T') {
					res[j] = 'P';
					res[j + 1] = 'C';
				}
			}
			
			for (char c : res) {
				System.out.print(c);
			}
			
			System.out.println();
		}
		
	}
	
}