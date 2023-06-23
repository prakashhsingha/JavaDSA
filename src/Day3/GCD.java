package Day3;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=50;
        int num2=30;
        
        int dividend = 0;
        int divisor = 0;
        
        if(num1 > num2) {
        	dividend = num1;
        	divisor = num2;
        }else {
        	dividend = num2;
        	divisor = num1;
        }
        int rem = dividend % divisor;
        while(rem > 0) {
        	dividend = divisor;
        	divisor = rem;
        	rem = dividend % divisor;
        }
        System.out.println(divisor);
	}

}
