import java.util.Scanner;

public class Chess960 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String res = "";
		
		byte[] index = new byte[2];
		byte j = 0;
		
		for (byte i = 0; i < 8; i++) {
			if (s.charAt(i) == 'R') {
				index[j] = (byte) (i + 1);
				j++;
			}
		}
		
		if (s.indexOf('K') + 1 == 8 || s.indexOf('K') + 1 == 1) {
			res = "No";
		} else {
			if (s.indexOf('K') + 1 > index[0] && s.indexOf('K') + 1 < index[1]) {
				j = 0;
				for (byte i = 0; i < 8; i++) {
					if (s.charAt(i) == 'B') {
						index[j] = (byte) (i + 1);
						j++;
					}
				}
				
				if (index[0] % 2 != index[1] % 2) {
					res = "Yes";
				} else
					res = "No";
			} else {
				res = "No";
			}
		}
		
		System.out.println(res);
		
	}
	
}