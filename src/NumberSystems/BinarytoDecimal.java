package NumberSystems;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int binary=100101;
        int multiplier=1;
        int dec=0;
        
        while(binary>0) {
        	int digit = binary % 10;
        	int value= multiplier * digit;
        	dec=dec+value;
        	
        	binary=binary/10;
        	multiplier=multiplier*2;
        	
        }
        System.out.println(dec);
	}

}
