package Day3;
import java.util.*;

public class PrintStarIncreasingrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row= sc.nextInt();
		
		int countr=0;
		while(countr<row) {
		   int countc=0;
		    while(countc<=countr) {
			   System.out.print("*");
			   countc++;
		    }
		   countr++;
		   System.out.println();

	}

}
}
