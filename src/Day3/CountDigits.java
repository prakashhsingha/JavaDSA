package Day3;

public class CountDigits {

	public static void main(String[] args) {
		int num=100078;
		int count = 0;
		
		while(num > 0) {
			int rem = num % 10;
			num/=10;
			count++;
		}
		System.out.println(count);
	}

}
