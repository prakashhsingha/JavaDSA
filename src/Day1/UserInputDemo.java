package Day1;
import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Principle =sc.nextInt();
		int roi = sc.nextInt();
		int time=sc.nextInt();
		
		int SI = (Principle * roi * time)/100;
		System.out.println(SI);

	}

}
