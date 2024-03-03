package question;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menuNo = 0;
		int count = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("************* 치킨메뉴판 **************");
			System.out.println("1.  황금올리브 반반한 치킨");
			System.out.println("2.  뿌잉클 치킨");
			System.out.println("3.  처갓집에서 호식이가 만든 치킨");
			System.out.println("0.  종료");
			System.out.print("************* 번호 : ");
			
			menuNo= sc.nextInt();
			
			if(menuNo == 0) {
				break;
			}
			
			
			
			switch (menuNo) {
			case 1: menuName = "황금올리브 반반한 치킨"; break;
			case 2: menuName = "뿌잉클 치킨"; break;
			case 3: menuName = "처갓집에서 호식이가 만든 치킨"; break;
			default: break;
			}
			
			if(menuNo >=1 && menuNo <= 3) {
				System.out.println();
				System.out.println("'"+menuName+"'"+"이(/가) 주문되었습니다.");
				System.out.println();
				System.out.println();
				count ++;
			}else {
				System.out.println();
				System.out.println("(0~3) 사이의 번호를 입력해주세요.");
				System.out.println();
				System.out.println();
			}
			
		} while (menuNo != 0);
		System.out.println();
		System.out.println("총 " + count +" 개의 상품이 주문되었습니다.");
		sc.close();
	}

}
