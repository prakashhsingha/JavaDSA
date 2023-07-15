package Day4;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int nst=1;
		int nsp=n/2;
		
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			if(row<=n/2) {
				nst+=2;
				nsp--;
			}else {
				nst-=2;
				nsp++;
			}
			row++;
			System.out.println();
		}
		

	}

}
