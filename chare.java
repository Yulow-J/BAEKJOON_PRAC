package BJ6;

import java.util.Scanner;
public class chare {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for(int i = 0; i < T; i++) {
	
			int R = in.nextInt();
			String S = in.next();	// nextLine() �� ���� error!
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < R; k++) {	// R ��ŭ �ݺ� ���
					System.out.print(S.charAt(j));
				}
			}
            
			System.out.println();
		}
	}
}