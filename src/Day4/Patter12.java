package Day4;

public class Patter12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int nstb=1;
		int nsp=2*n -3;
		int nsta=1;
		
		while(row<=n) {
			int cstb=1;
			while(cstb<=nstb) {
				System.out.print("*");
				cstb++;
			}
			
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int csta=1;
			if(row==n) {
				csta=2;
//				nsta--;
			}
			while(csta <= nsta) {
				System.out.print("*");
				csta++;
			}
			
			nstb++;
			nsp-=2;
			nsta++;
			
			System.out.println();
			row++;
			
			
		}

	}

}
