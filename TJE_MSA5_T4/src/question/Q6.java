package question;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		double random = Math.random();
		System.out.print("몇 게임?  ");
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int count = 0;
		int arr[] = new int[6];	
		
		
		do {
			
			
			for (int i = 0 ; i<arr.length; i++) { //숫자 6개 대입
				int r = (int)(Math.random() *45 +1);
				arr[i]=r;
				for(int j =0; j<i;j++){
					if(arr[i] == arr[j]) {
						i--;
						
						break;
					}
				}
			}
			
			
			
		}while(N == count);
		
		System.out.println(count);
		
	
		for (int i : arr) { //오름차순, 중복X
			
			System.out.print(i+" ");
			
		}
		
	}
}
