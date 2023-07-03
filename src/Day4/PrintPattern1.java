package Day4;

public class PrintPattern1 {

	public static void main(String[] args) {
		
		int row = 5;
		int n =1;
		
		int nst = row;
		while(n <= row) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			System.out.println();
			nst--;
			n++;
		}

	}

}
//
//*****
//****
//***
//**
//*
//
