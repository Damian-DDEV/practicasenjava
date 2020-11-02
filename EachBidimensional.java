

public class EachBidimensional {

	public static void main(String[] args) {
		
		int[][] eachbidim = {
				
				{10,20,30,40},
				{11,21,31,41},
				{12,22,32,42},
				{13,23,33,43},
				{14,24,34,44}
		};
		
		for (int[] z:eachbidim) {
				System.out.println(" ");
			for(int x:z) {
				
				System.out.print(x + " ");
			}
		}
	}

}
