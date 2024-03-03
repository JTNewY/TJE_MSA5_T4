package question;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		
		int N = sc.nextInt();
		
		if(N>0 && N<=100) {
			for(int j = 1; j <= N; j++) {
				if( j%2 == 1) { // 홀수 일 경우
					if(j ==1) {
						System.out.print(j);
					}else {
						System.out.print("+"+j);
					}
					odd += j;
					}
			}
			System.out.println("="+odd);
			for(int i = 1; i <=N; i++) {
				if(i%2 ==0) { //짝수 일 경우
					if(i == 2) {
						System.out.print(i);
					}else {
						System.out.print("+"+i);
					}
					even += i;
				}
			}System.out.println("="+even);
			
			for(int k= 1; k<=N;k++) {
				if(N%k == 0) {
					if(k ==N) {
						System.out.print(k);
					}else {
						System.out.print(k +" ");
					}
					
				}
			}
			
		}
		
		
		sc.close();
	}

}
