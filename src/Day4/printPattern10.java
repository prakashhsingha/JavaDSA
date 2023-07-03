package Day4;

public class printPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int row=1;
        int nsp=0;
        int nst=n;
        
        while(row <= n*2-1) {
        	int csp=1;
        	while(csp<=nsp) {
        		System.out.print("\t");
        		csp++;
        	}
        	
        	int cst=1;
        	while(cst<=nst) {
        		System.out.print("*\t");
        		cst++;
        	}
        	
        	if(row < n) {
        		nsp += 2;
        		nst--;
        	}else {
        		nsp-=2;
        		nst++;
        	}
        	row++;
        	System.out.println();
        	
        }
	}

}
