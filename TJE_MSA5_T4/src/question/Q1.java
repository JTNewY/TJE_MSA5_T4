package question;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("자바 점수 : ");
		int java= sc.nextInt();
		
		
		int sum = eng + math + java;
		System.out.println("총점 : "+ sum);
		double avg = sum /3;
		System.out.println("평균 :"+ (double)avg);
	
		sc.close();
	}

}
