package BJ8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class trang {
	public static boolean[] prime = new boolean[246913];
    
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		get_prime();	
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;	
            
			int count = 0;	
            
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) count++;
			}
			System.out.println(count);
		}		
	}
	

	public static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
 
}