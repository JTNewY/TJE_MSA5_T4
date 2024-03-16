package Team;

import java.util.Scanner;

public class Team_04_Q_8 {
//	정수 N을 입력 받아, 
//	N행 N열의 2차원 배열을 선언하시오. 
//	그리고 배열요소의 1부터 1씩 증가하는 값을 순서대로 저장하면서 
//	1 행이 증가할 때마다 배열요소에 접근하는 방향을 반대로 하여 값을
//	저장하고 출력하시오.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];// 2차원 배열 선언
    int num =1;// 배열에 저장할 값
    
    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) { // 짝수 행일 경우
            for (int j = 0; j < n; j++) {
                arr[i][j] = num++;
            }
        } else { // 홀수 행일 경우
            for (int j = n - 1; j >= 0; j--) {
                arr[i][j] = num++;
            }
        }
       // 배열 출력
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(arr[i][j] + "\t");
        }
        System.out.println();
    } 
       sc.close();
    }
 }
}
