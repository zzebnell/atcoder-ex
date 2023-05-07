/*
 * 
 * 
 *  AtCoder Beginner Contest 297
 *  Problem A
 * 
 * 
 * */

import java.util.Scanner;

public class DoubleClick {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte n = sc.nextByte();
		int d = sc.nextInt();
		int[] val = new int[n];
		String res = "-1";
		
		for (byte i = 0 ; i < n; i++) {
			val[i] = sc.nextInt();
			if (i >= 1) {
				if (val[i] - val[i - 1] <= d) {
					res = val[i] + "";
					break;
				}
			}
		}
		
		System.out.println(res);
		
	}
	
}