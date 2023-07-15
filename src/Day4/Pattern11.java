package Day4;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int row = 1;
		int nstb=n/2;
		int nsp=1;
		int nsta=n/2;
		
		while(row<=n) {
			int cstb=1;
			while(cstb<=nstb) {
				System.out.print("*");
				cstb++;
			}
			
			int csp=1;
			while(csp<=nsp) {
				if(csp==1 || csp==nsp) {
				    System.out.print("*");
				}else {
					System.out.print(" ");
				}
				csp++;
			}
			
			int csta=1;
			while(csta<=nsta) {
				System.out.print("*");
				csta++;
			}
			
			if(row<=n/2) {
				nstb--;
				nsta--;
				nsp+=2;
			}else {
				nstb++;
				nsta++;
				nsp-=2;
			}
			
			System.out.println();
			row++;
		}

	}

}

//* * * * * * *
//* * *   * * *
//* *       * *
//*           *
//* *       * *
//* * *   * * *
//* * * * * * *
