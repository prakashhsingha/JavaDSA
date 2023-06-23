package Day3;

public class InverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=32145;
		int inverseNum = 0;
		int place = 1;
		while(num > 0) {
			
			int digit = num % 10;
//			System.out.println(place + " " + digit);
			int invDigit=place;
			int invPlace =digit;
			inverseNum = (int) (inverseNum + invDigit * Math.pow(10,invPlace-1));
//			System.out.println(invPlace + " " + invDigit);
			num = num/10;
			place++;
			
		}
		System.out.println(inverseNum);

	}

}
