package question;

public class Q3 {
	public static void main(String[] args) {
		for (int i =1;i<=100;i++) {
			//십의자리 수 : 해당수 (i) / 10 (정수부분만)
			int ten = i/10;
			//일의자리 수 : 해당수 (i) % 10
			int one = i%10;
			
			boolean ten369 = (ten != 0)&&(ten %3 == 0);
			// boolean ten369 = one == 3 || one == 6 || one == 9 ;
			
			boolean one369 = (one != 0) && (one%3 ==0);
			// boolean one369 = one == 3 || one == 6 || one == 9 ;
			
			if(ten369 && one369)
				System.out.println("**");
			else if (ten369 || one369)
				System.out.println("*");
			else
				System.out.println(i);
		}
	}
}
