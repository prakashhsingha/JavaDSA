package Day4;

public class printPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int nst=5;
		
		while(row<=n) {
			int cst=1;
			while(cst <= nst) {
				if(row==1 || cst==1 || row==n || cst==n) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
				cst++;
			}
			System.out.println();
			row++;
		}

	}

}
