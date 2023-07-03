package Day4;

public class printPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int row=1;
        int nst=1;
        while(row<=n*2-1) {
        	int cst=1;
        	while(cst<=nst) {
        		System.out.print("*");
        		cst++;
        	}
        	if(row<n) {
        		nst++;
        	}else {
        		nst--;
        	}
        	System.out.println();
        	row++;
        }
	}

}
