package Day2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
		
		if (inputNumber % 2 == 0) {
			System.out.println("Given number is even");
		}else {
			System.out.println("Given number is odd");
		}
        
      

	}

}
