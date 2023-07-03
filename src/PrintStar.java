
public class PrintStar {

	public static void main(String[] args) {
	   
		int rows=5;
		int cols=5;
		
		int rowCnt = 0;
		
	    while(rowCnt < rows) {
	    	int colCnt = 0;
	    	while(colCnt < cols) {
	    		System.out.print("*");
	    		colCnt++;
	    	}
	    	System.out.println();
	    	rowCnt++;
	    }

	}

}
