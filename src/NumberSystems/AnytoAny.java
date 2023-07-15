package NumberSystems;

public class AnytoAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int src=8;
		int dest=2;
		int num=33;
		
	//	1:for any to any conversion first we will convert into decimal
		int decimal=0;
		int multiplier=1;
		
		while(num>0) {
			int rem=num%10;
			num=num/10;
			
			int value =multiplier * rem;
			decimal= decimal+value;
			
			multiplier=multiplier * 8;
		}
		System.out.println(decimal);
	//	2:then we will convert decimal to given destination base
		int binary=0;
		multiplier=1;
		while(decimal > 0) {
			int rem1=decimal % 2;
			decimal=decimal/2;
			
			int value1=multiplier * rem1;
			binary=binary + value1;
			
			multiplier=multiplier * 10;
		}
		System.out.println(binary);
		

	}

}
