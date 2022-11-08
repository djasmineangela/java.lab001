import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int mark = in.nextInt();
		
		System.out.println("The mark is " + mark);
		if (mark >= 50)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		
		
	}
	

}
