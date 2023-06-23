package Day3;
import java.util.Scanner;

public class ReverseNumberActual {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int reverse = 0;
	  
	  while (num > 0) {
		  int digitRem = num % 10;
		  reverse = reverse * 10 + digitRem;
		  num/=10;
	  }
	  System.out.println(reverse);

	}

}
