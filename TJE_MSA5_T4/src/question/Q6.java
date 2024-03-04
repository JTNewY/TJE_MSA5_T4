package question;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		double random = Math.random();
		System.out.print("몇 게임?  ");
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int count = 1;
		int arr[] = new int[6];	
		
		
		while(count <= N) {
			System.out.print("["+count+"게임] : ");
			// 랜덤 입력
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
			
			// 선택 정렬 
			for(int i =0; i<arr.length; i++) {
				for(int j =i+1; j<arr.length; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			// 출력
			for (int i : arr) { //오름차순, 중복X
				
				System.out.print(i+" ");
				
			}
			System.out.println();
			
			count++;
		}
		
		
		
	
		
	}
}
