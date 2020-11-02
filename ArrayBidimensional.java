

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		int [][] bidim = new int [4][5];
		
		bidim [0][0] = 12;
		bidim [0][1] = 13;
		bidim [0][2] = 20;
		bidim [0][3] = 21;
		bidim [0][4] = 36;
		
		bidim [1][0] = 27;
		bidim [1][1] = 49;
		bidim [1][2] = 70;
		bidim [1][3] = 78;
		bidim [1][4] = 45;
		
		bidim [2][0] = 54;
		bidim [2][1] = 38;
		bidim [2][2] = 6;
		bidim [2][3] = 2;
		bidim [2][4] = 9;
		
		bidim [3][0] = 94;
		bidim [3][1] = 92;
		bidim [3][2] = 75;
		bidim [3][3] = 68;
		bidim [3][4] = 53;
		
		for (int i=0;i<4;i++) {
			
			for(int j=0;i<5;i++) {
				
				System.out.println(bidim[i][j] + " ");
			}
		}
		
		
		
}

}