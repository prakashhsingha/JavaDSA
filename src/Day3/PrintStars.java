package Day3;

import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Scanner sc = new Scanner(System.in);
	   int numCol = sc.nextInt();
	   int numRow = sc.nextInt();
	   
	   int countr=0;
	   while(countr<numRow) {
		   int countc=0;
		   while(countc<numCol) {
			   System.out.print("*");
			   countc++;
		   }
		   countr++;
		   System.out.println();
	   }

	}

}
