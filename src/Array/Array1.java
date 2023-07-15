package Array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] house = new int[6];
		
		System.out.println(house);
		for(int index=0;index<=5;index++) {
			System.out.println(house[index]);
		}
		
		house[0] = 5;
		house[1] =10;
		
		for(int index=0;index<=5;index++) {
			System.out.println(house[index]);
		}

	}

}
