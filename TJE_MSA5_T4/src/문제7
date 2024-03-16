package Team;

import java.util.Scanner;

public class Team_04_Q_7 {
	//1차원 배열에 저장하고 성적을 기준으로 오름차순, 
	//내림차순으로 각각 출력하시오.
	//(단, 정렬 방식은 선택정렬, 버블정렬, 삽입정렬 중 
	//하나의 정렬 방식을 이용하시오. 
	//성적은 정수 0이상 100이하로 주어집니다.)
	//	• (조건)
	//	JAVA API에서 제공되는 메소드는 이용하지 않는다.
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    int[] grades = new int[5]; // 5명의 학생 성적을 저장할 배열

	        // 성적 입력
	        for (int i = 0; i < grades.length; i++) {
	            int grade;
	            do {
	                System.out.print("");
	                grade = sc.nextInt();
	                if (grade < 0 || grade > 100) {
	                    System.out.println("잘못된 성적입니다. 0에서 100 사이의 성적을 입력해주세요.");
	                }
	            } while (grade < 0 || grade > 100);
	            grades[i] = grade;
	        }

	        // 버블 정렬로 오름차순 정렬
	        bubbleSort(grades, true);

	        // 오름차순으로 정렬된 성적 출력
	        System.out.print("오름차순: ");
	        for (int grade : grades) {
	            System.out.print(grade + " ");
	        }
	        System.out.println(); // 줄바꿈

	        // 버블 정렬로 내림차순 정렬
	        bubbleSort(grades, false);

	        // 내림차순으로 정렬된 성적 출력
	        System.out.print("내림차순: ");
	        for (int grade : grades) {
	            System.out.print(grade + " ");
	        }
	        System.out.println(); // 줄바꿈

	        sc.close();
	    }

	    // 버블 정렬 메소드
	    public static void bubbleSort(int[] array, boolean ascending) {
	        for (int i = 0; i < array.length - 1; i++) {
	            for (int j = 0; j < array.length - i - 1; j++) {
	                if ((ascending && array[j] > array[j + 1]) || (!ascending && array[j] < array[j + 1])) {
	                    // 성적 교환
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
  }
